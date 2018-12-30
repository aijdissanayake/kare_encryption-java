RSA        

kare.encryption
===============

Class RSA
---------

*   java.lang.Object
*   *   kare.encryption.RSA

*   * * *
    
      
    
    public final class RSA
    extends java.lang.Object
    
    Kare Encryption
    ===============
    
    RSA Encryption library
    
    Since:
    
    2018-12-28
    

*   *   ### Method Summary
        
        All Methods[Static Methods](javascript:show(1);)[Concrete Methods](javascript:show(8);)
        
        Modifier and Type
        
        Method and Description
        
        `static java.lang.String`
        
        `[decrypt](../../kare/encryption/RSA.html#decrypt-java.security.PrivateKey-java.lang.String-)(java.security.PrivateKey key, java.lang.String encryptedData)`
        
        The method that will decrypt a base64 encoded encrypted String.
        
        `static java.lang.String`
        
        `[encrypt](../../kare/encryption/RSA.html#encrypt-java.security.PublicKey-java.lang.String-)(java.security.PublicKey key, java.lang.String data)`
        
        The method that will encrypt a String.
        
        `static java.security.KeyPair`
        
        `[generateKeyPair](../../kare/encryption/RSA.html#generateKeyPair--)()`
        
        The method that will generate a RSA private public key pair of bit length 2048.
        
        `static java.security.KeyPair`
        
        `[generateKeyPair](../../kare/encryption/RSA.html#generateKeyPair-int-)(int keyLength)`
        
        The method that will generate a RSA private public key pair.
        
        `static java.security.PrivateKey`
        
        `[importPrivateKey](../../kare/encryption/RSA.html#importPrivateKey-java.lang.String-)(java.lang.String filePath)`
        
        The method that will import a RSA private key from a .key file which is in the PKCS #8 - pem format.
        
        `static java.security.PublicKey`
        
        `[importPublicKey](../../kare/encryption/RSA.html#importPublicKey-java.lang.String-)(java.lang.String filePath)`
        
        The method that will import a RSA public key from a .key file which is in the PKCS #8 - pem format.
        
        `static boolean`
        
        `[savePrivateKey](../../kare/encryption/RSA.html#savePrivateKey-java.security.PrivateKey-java.lang.String-)(java.security.PrivateKey privateKey, java.lang.String fileSavePath)`
        
        The method that will save a RSA private key in a .key file in the PKCS #8 - pem format.
        
        `static boolean`
        
        `[savePublicKey](../../kare/encryption/RSA.html#savePublicKey-java.security.PublicKey-java.lang.String-)(java.security.PublicKey publicKey, java.lang.String fileSavePath)`
        
        The method that will save a public key in a .key file PKCS #8 - pem format.
        
        *   ### Methods inherited from class java.lang.Object
            
            `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Method Detail
        
        *   #### generateKeyPair
            
            public static java.security.KeyPair generateKeyPair(int keyLength)
            
            The method that will generate a RSA private public key pair.
            
            Parameters:
            
            `keyLength` - The is the bit length of the key.
            
            Returns:
            
            The generated key pair in the form of `KeyPair`, otherwise `null` if key generation could not be performed.
            
        
        *   #### generateKeyPair
            
            public static java.security.KeyPair generateKeyPair()
            
            The method that will generate a RSA private public key pair of bit length 2048.
            
            Returns:
            
            The generated 2048 bit size key pair in the form of `KeyPair`, otherwise `null` if key generation could not be performed.
            
        
        *   #### savePublicKey
            
            public static boolean savePublicKey(java.security.PublicKey publicKey,
                                                java.lang.String fileSavePath)
                                         throws java.security.NoSuchAlgorithmException,
                                                java.io.IOException,
                                                OperatorCreationException,
                                                java.security.spec.InvalidKeySpecException
            
            The method that will save a public key in a .key file PKCS #8 - pem format.
            
            Parameters:
            
            `publicKey` - The `PublicKey` that need to be saved in a .key file.
            
            `fileSavePath` - The path including the file name where the publicKey should be saved.
            
            Returns:
            
            `true` if the key is saved in a .key file successfully, otherwise `false`.
            
            Throws:
            
            `java.security.NoSuchAlgorithmException`
            
            `java.io.IOException`
            
            `OperatorCreationException`
            
            `java.security.spec.InvalidKeySpecException`
            
        
        *   #### savePrivateKey
            
            public static boolean savePrivateKey(java.security.PrivateKey privateKey,
                                                 java.lang.String fileSavePath)
                                          throws java.security.NoSuchAlgorithmException,
                                                 java.io.IOException,
                                                 OperatorCreationException,
                                                 java.security.spec.InvalidKeySpecException
            
            The method that will save a RSA private key in a .key file in the PKCS #8 - pem format.
            
            Parameters:
            
            `privateKey` - The `PrivateKey` that need to be saved in a .key file.
            
            `fileSavePath` - The path including the file name where the privateKey should be saved.
            
            Returns:
            
            `true` if the key is saved in a .key file successfully, otherwise `false`.
            
            Throws:
            
            `java.security.NoSuchAlgorithmException`
            
            `java.io.IOException`
            
            `OperatorCreationException`
            
            `java.security.spec.InvalidKeySpecException`
            
        
        *   #### importPublicKey
            
            public static java.security.PublicKey importPublicKey(java.lang.String filePath)
                                                           throws java.io.FileNotFoundException,
                                                                  java.io.IOException,
                                                                  java.security.NoSuchAlgorithmException,
                                                                  java.security.NoSuchProviderException,
                                                                  java.security.spec.InvalidKeySpecException
            
            The method that will import a RSA public key from a .key file which is in the PKCS #8 - pem format.
            
            Parameters:
            
            `filePath` - The file path including the file name where the public key to be imported is located.
            
            Returns:
            
            The imported public key in the formt of `PublicKey` if the key is imported successfully, otherwise `null`.
            
            Throws:
            
            `java.io.FileNotFoundException`
            
            `java.io.IOException`
            
            `java.security.NoSuchAlgorithmException`
            
            `java.security.NoSuchProviderException`
            
            `java.security.spec.InvalidKeySpecException`
            
        
        *   #### importPrivateKey
            
            public static java.security.PrivateKey importPrivateKey(java.lang.String filePath)
                                                             throws java.io.FileNotFoundException,
                                                                    java.io.IOException,
                                                                    java.security.NoSuchAlgorithmException,
                                                                    java.security.NoSuchProviderException,
                                                                    java.security.spec.InvalidKeySpecException
            
            The method that will import a RSA private key from a .key file which is in the PKCS #8 - pem format.
            
            Parameters:
            
            `filePath` - The file path including the file name where the private key to be imported is located.
            
            Returns:
            
            The imported private key in the formt of `PrivateKey` if the key is imported successfully, otherwise `null`.
            
            Throws:
            
            `java.io.FileNotFoundException`
            
            `java.io.IOException`
            
            `java.security.NoSuchAlgorithmException`
            
            `java.security.NoSuchProviderException`
            
            `java.security.spec.InvalidKeySpecException`
            
        
        *   #### encrypt
            
            public static java.lang.String encrypt(java.security.PublicKey key,
                                                   java.lang.String data)
            
            The method that will encrypt a String.
            
            Parameters:
            
            `key` - The `PublicKey` used to encrypt the data.
            
            `data` - The data in the form of a String.
            
            Returns:
            
            The encrypted base64 encoded String, otherwise `null` if encryption could not be performed.
            
        
        *   #### decrypt
            
            public static java.lang.String decrypt(java.security.PrivateKey key,
                                                   java.lang.String encryptedData)
            
            The method that will decrypt a base64 encoded encrypted String.
            
            Parameters:
            
            `key` - The `PrivateKey` used to decrypt the data.
            
            `encryptedData` - The encrypted in the form of base64 encoded String.
            
            Returns:
            
            The decrypted data in the form of String, otherwise `null` if decryption could not be performed.