package kare.encryption;

import java.security.KeyPair;  
import java.security.KeyPairGenerator;  
import java.security.NoSuchAlgorithmException;  
import java.security.SecureRandom;  
import java.security.spec.InvalidKeySpecException;
import java.security.Security;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.NoSuchProviderException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.StringWriter; 
import java.util.Base64;
import javax.crypto.Cipher;

import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.io.pem.PemObject; 
import org.bouncycastle.util.io.pem.PemReader; 
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.io.pem.PemWriter;

public class RSA{

    private static final String algorithm = "RSA";
    
    public static KeyPair generateKeyPair(int keyLength){
        try {
			final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(algorithm);
			keyGen.initialize(keyLength, new SecureRandom());
			final KeyPair keyPair = keyGen.generateKeyPair();
			return keyPair;

		} catch (Exception e) {
			e.printStackTrace();
		}		
		return null;
    }

    public static KeyPair generateKeyPair(){
        return generateKeyPair(2048);
    }

    public static boolean savePublicKey(PublicKey publicKey, String fileSavePath) throws NoSuchAlgorithmException, IOException, OperatorCreationException, InvalidKeySpecException {
        try{
            byte[] pubBytes = publicKey.getEncoded();
            PemObject pemObject = new PemObject("PUBLIC KEY", pubBytes);
            StringWriter stringWriter = new StringWriter();
            PemWriter pemWriter = new PemWriter(stringWriter);
            pemWriter.writeObject(pemObject);
            pemWriter.close();
            String pemString = stringWriter.toString();
            FileOutputStream fos2 = new FileOutputStream(fileSavePath);  
            fos2.write(pemString.getBytes());  
            fos2.flush();  
            fos2.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean savePrivateKey(PrivateKey privateKey, String fileSavePath) throws NoSuchAlgorithmException, IOException, OperatorCreationException, InvalidKeySpecException {
        try{
            byte[] pvtBytes = privateKey.getEncoded();
            PemObject pemObject = new PemObject("PRIVATE KEY", pvtBytes);
            StringWriter stringWriter = new StringWriter();
            PemWriter pemWriter = new PemWriter(stringWriter);
            pemWriter.writeObject(pemObject);
            pemWriter.close();
            String pemString = stringWriter.toString();
            FileOutputStream fos2 = new FileOutputStream(fileSavePath);  
            fos2.write(pemString.getBytes());  
            fos2.flush();  
            fos2.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String encrypt(PublicKey key, String data) {		
		try {
			final Cipher cipher = Cipher.getInstance(algorithm);
			cipher.init(Cipher.ENCRYPT_MODE, key);
			return  Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));

		} catch (Exception e) {
            e.printStackTrace();
		}
		return null;
    }
    
    public static String decrypt(PrivateKey key, String encryptedData) {
		try {
			final Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] enc64Bytes = encryptedData.getBytes();
            byte[] encBytes = Base64.getDecoder().decode(enc64Bytes);
			return new String(cipher.doFinal(encBytes));

		} catch (Exception e) {
            e.printStackTrace();
		}
		return null;
    }

    public static PublicKey importPublicKey(String filename) throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException{
        Security.addProvider(new BouncyCastleProvider());
        PemReader pemReader = new PemReader(new InputStreamReader(new FileInputStream(filename)));
        try {
            PemObject pemObject = pemReader.readPemObject();
            byte[] content = pemObject.getContent();
            X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(content);
            KeyFactory factory = KeyFactory.getInstance("RSA", "BC");
            return factory.generatePublic(pubKeySpec);
        }finally {
            pemReader.close();
        }        
    }

    public static PrivateKey importPrivateKey(String filename) throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException{
        Security.addProvider(new BouncyCastleProvider());
        PemReader pemReader = new PemReader(new InputStreamReader(new FileInputStream(filename)));
        try {
            PemObject pemObject = pemReader.readPemObject();
            byte[] content = pemObject.getContent();
            PKCS8EncodedKeySpec privKeySpec = new PKCS8EncodedKeySpec(content);
            KeyFactory factory = KeyFactory.getInstance("RSA", "BC");
            return factory.generatePrivate(privKeySpec);
        }finally {
            pemReader.close();
        }        
    }
}
