package kare.encryption;

import org.junit.Test;
import static org.junit.Assert.*;
import org.bouncycastle.operator.OperatorCreationException;

import java.io.IOException;
import java.util.Objects; 
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class RSATest {
    @Test public void testGenerateKeyPair() throws NoSuchAlgorithmException, IOException, OperatorCreationException, InvalidKeySpecException  {
        KeyPair keyPair = RSA.generateKeyPair();
        PrivateKey pvtKey = keyPair.getPrivate();
        PublicKey pubKey = keyPair.getPublic();
        assertTrue("savePrivateKey should return 'true'",RSA.savePrivateKey(pvtKey, "pvtT.key"));
        assertTrue("savePublicKey should return 'true'",RSA.savePublicKey(pubKey, "pubT.key"));

    }

    @Test public void testEncryptDecrypt(){
        KeyPair keyPair = RSA.generateKeyPair();
        PrivateKey pvtKey = keyPair.getPrivate();
        PublicKey pubKey = keyPair.getPublic();
        String enc = RSA.encrypt(pubKey, "abcde");
        System.out.println(enc);
        String dec = RSA.decrypt(pvtKey, enc);
        System.out.println(dec);
        assertTrue("decrypted value should equal to 'abcde'", Objects.equals(dec, "abcde"));
    }

    @Test public void testKeyImport() throws Exception {
            PublicKey pubKey = RSA.importPublicKey("pubT.key");
            PrivateKey pvtKey = RSA.importPrivateKey("pvtT.key");
            String enc = RSA.encrypt(pubKey, "abcde");
            System.out.println(enc);
            String dec = RSA.decrypt(pvtKey, enc);
            System.out.println(dec);
            assertTrue("decrypted value should equal to 'abcde'", Objects.equals(dec, "abcde"));
    }
}
