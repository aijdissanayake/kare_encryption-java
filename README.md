# Documentation

## Install

Place the `kare-encryption.jar` (can be found in the `build\libs` folder of this project) and the dependencies by `BouncyCastle`; `bcpkix-jdk15on-160.jar` and `bcprov-jdk15on-159.jar` (can be found in the `libs` folder of this project or download online at [BouncyCastle releases](https://www.bouncycastle.org/latest_releases.html).) in the library folder of your project.

## Initialize/Import

Import the RSA implementation in the `.java` file you want to use as follow,

```java
import kare.encryption.RSA;
```

Then access the static methods from the class `RSA` inside the functions you want to use them as follow,

```java
KeyPair keyPair = RSA.generateKeyPair();
```

## `public final class RSA`

<h1>Kare Encryption</h1>

RSA Encryption library

 * **Author:** Achala Dissanayake
 * **Version:** 1.0.0
 * **Since:** 2018-12-28

## `public static KeyPair generateKeyPair(int keyLength)`

The method that will generate a RSA private public key pair.

 * **Parameters:** `keyLength` — The is the bit length of the key.

     <p>
 * **Returns:** The generated key pair in the form of {@link KeyPair}, otherwise {@code null} if key generation could not be performed.

## `public static KeyPair generateKeyPair()`

The method that will generate a RSA private public key pair of bit length 2048.

 * **Returns:** The generated 2048 bit size key pair in the form of {@link KeyPair}, otherwise {@code null} if key generation could not be performed.

## `public static boolean savePublicKey(PublicKey publicKey, String fileSavePath) throws NoSuchAlgorithmException, IOException, OperatorCreationException, InvalidKeySpecException`

The method that will save a public key in a .key file PKCS #8 - pem format.

 * **Parameters:**
   * `publicKey` — The {@link PublicKey} that need to be saved in a .key file.

     <p>
   * `fileSavePath` — The path including the file name where the publicKey should be saved.

     <p>
 * **Returns:** {@code true} if the key is saved in a .key file successfully, otherwise {@code false}.

## `public static boolean savePrivateKey(PrivateKey privateKey, String fileSavePath) throws NoSuchAlgorithmException, IOException, OperatorCreationException, InvalidKeySpecException`

The method that will save a RSA private key in a .key file in the PKCS #8 - pem format.

 * **Parameters:**
   * `privateKey` — The {@link PrivateKey} that need to be saved in a .key file.

     <p>
   * `fileSavePath` — The path including the file name where the privateKey should be saved.

     <p>
 * **Returns:** {@code true} if the key is saved in a .key file successfully, otherwise {@code false}.

## `public static PublicKey importPublicKey(String filePath) throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException`

The method that will import a RSA public key from a .key file which is in the PKCS #8 - pem format.

 * **Parameters:** `filePath` — The file path including the file name where the public key to be imported is located.

     <p>
 * **Returns:** The imported public key in the formt of {@link PublicKey} if the key is imported successfully, otherwise {@code null}.

## `public static PrivateKey importPrivateKey(String filePath) throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException`

The method that will import a RSA private key from a .key file which is in the PKCS #8 - pem format.

 * **Parameters:** `filePath` — The file path including the file name where the private key to be imported is located.

     <p>
 * **Returns:** The imported private key in the formt of {@link PrivateKey} if the key is imported successfully, otherwise {@code null}.

## `public static String encrypt(PublicKey key, String data)`

The method that will encrypt a String.

 * **Parameters:**
   * `key` — The {@link PublicKey} used to encrypt the data.

     <p>
   * `data` — The data in the form of a String.

     <p>
 * **Returns:** The encrypted base64 encoded String, otherwise {@code null} if encryption could not be performed.

## `public static String decrypt(PrivateKey key, String encryptedData)`

The method that will decrypt a base64 encoded encrypted String.

 * **Parameters:**
   * `key` — The {@link PrivateKey} used to decrypt the data.

     <p>
   * `encryptedData` — The encrypted in the form of base64 encoded String.

     <p>
 * **Returns:** The decrypted data in the form of String, otherwise {@code null} if decryption could not be performed.
