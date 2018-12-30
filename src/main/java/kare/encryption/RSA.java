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


/**
* <h1>Kare Encryption</h1>
*
* RSA Encryption library
*
* @author  Achala Dissanayake
* @version 1.0.0
* @since   2018-12-28
*/

public class RSA{

    private static final String algorithm = "RSA";
    
	/**
	 * The method that will generate a RSA private public key pair.
	 * 
	 * @param keyLength
	 * 		The is the bit length of the key.
	 * 
	 * @return The generated key pair in the form of {@link KeyPair}, otherwise {@code null} if key generation could not be performed.
	 */ 
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

	/**
	 * The method that will generate a RSA private public key pair of bit length 2048.
	 * 
	 * @return The generated 2048 bit size key pair in the form of {@link KeyPair}, otherwise {@code null} if key generation could not be performed.
	 */ 
    public static KeyPair generateKeyPair(){
        return generateKeyPair(2048);
    }

	/**
	 * The method that will save a public key in a .key file PKCS #8 - pem format.
	 * 
	 * @param publicKey
	 * 		The {@link PublicKey} that need to be saved in a .key file.
	 * 
	 * @param fileSavePath
	 * 		The path including the file name where the publicKey should be saved.
	 * 
	 * @return {@code true} if the key is saved in a .key file successfully, otherwise {@code false}.
	 */
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

	/**
	 * The method that will save a RSA private key in a .key file in the PKCS #8 - pem format.
	 * 
	 * @param privateKey
	 * 		The {@link PrivateKey} that need to be saved in a .key file.
	 * 
	 * @param fileSavePath
	 * 		The path including the file name where the privateKey should be saved.
	 * 
	 * @return {@code true} if the key is saved in a .key file successfully, otherwise {@code false}.
	 */
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

	/**
	 * The method that will import a RSA public key from a .key file which is in the PKCS #8 - pem format.
	 * 
	 * @param filePath
	 * 		The file path including the file name where the public key to be imported is located.
	 * 
	 * @return The imported public key in the formt of {@link PublicKey} if the key is imported successfully, otherwise {@code null}.
	 */
    public static PublicKey importPublicKey(String filePath) throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException{
        Security.addProvider(new BouncyCastleProvider());
        PemReader pemReader = new PemReader(new InputStreamReader(new FileInputStream(filePath)));
        try {
            PemObject pemObject = pemReader.readPemObject();
            byte[] content = pemObject.getContent();
            X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(content);
            KeyFactory factory = KeyFactory.getInstance("RSA", "BC");
            return factory.generatePublic(pubKeySpec);
        }catch (Exception e) {
            e.printStackTrace();
		}
        finally {
            pemReader.close();
        }
        return null;        
    }

	/**
	 * The method that will import a RSA private key from a .key file which is in the PKCS #8 - pem format.
	 * 
	 * @param filePath
	 * 		The file path including the file name where the private key to be imported is located.
	 * 
	 * @return The imported private key in the formt of {@link PrivateKey} if the key is imported successfully, otherwise {@code null}.
	 */
    public static PrivateKey importPrivateKey(String filePath) throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException{
        Security.addProvider(new BouncyCastleProvider());
        PemReader pemReader = new PemReader(new InputStreamReader(new FileInputStream(filePath)));
        try {
            PemObject pemObject = pemReader.readPemObject();
            byte[] content = pemObject.getContent();
            PKCS8EncodedKeySpec privKeySpec = new PKCS8EncodedKeySpec(content);
            KeyFactory factory = KeyFactory.getInstance("RSA", "BC");
            return factory.generatePrivate(privKeySpec);
        }catch (Exception e) {
            e.printStackTrace();
		}
        finally {
            pemReader.close();
        }
        return null;       
    }

    /**
	 * The method that will encrypt a String.
	 * 
	 * @param key
	 * 		The {@link PublicKey} used to encrypt the data.
	 * 
	 * @param data
	 * 		The data in the form of a String.
	 * 
	 * @return The encrypted base64 encoded String, otherwise {@code null} if encryption could not be performed.
	 */
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
    
    /**
	 * The method that will decrypt a base64 encoded encrypted String.
	 * 
	 * @param key
	 * 		The {@link PrivateKey} used to decrypt the data.
	 * 
	 * @param encryptedData
	 * 		The encrypted in the form of base64 encoded String.
	 * 
	 * @return The decrypted data in the form of String, otherwise {@code null} if decryption could not be performed.
	 */
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

}
