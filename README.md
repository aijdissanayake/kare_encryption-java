<a name="skip.navbar.top" style="color:#353833;"></a>

<div class="header" style="clear:both;
    margin:0 20px;
    padding:5px 0 0 0;">

# kare.encryption

## Class RSA

</div>

<div class="contentContainer" style="clear:both;
    padding:10px 20px;
    position:relative;">

*   java.lang.Object
*   *   kare.encryption.RSA

<div class="description">

*   * * *

    <pre style="font-family:'DejaVu Sans Mono', monospace;font-size:14px;margin-top:0;">public final class <span class="typeNameLabel" style="font-weight:bold;">RSA</span>
    extends java.lang.Object</pre>

    <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">

    # Kare Encryption

    </div>

    <div>

    *   Method:  
    *   [Summary](#method.summary)|
    *   [Detail](#method.detail)

    </div>

    <div>RSA Encryption library</div>

    <dl>

    <dt style="font-size:12px;
        font-weight:bold;
        margin:10px 0 0 0;
        color:#4E4E4E;"><span class="simpleTagLabel" style="font-weight:bold;">Since:</span></dt>

    <dd style="margin:5px 0 10px 0px;
        font-size:14px;
        font-family:'DejaVu Sans Mono',monospace;">2018-12-28</dd>

    </dl>

</div>

<div class="summary">

*   *   <a name="method.summary" style="color:#353833;"></a>

        ### Method Summary

        <table class="memberSummary" summary="Method Summary table, listing methods, and an explanation" style="width:100%;border-left:1px solid #EEE;border-right:1px solid #EEE;border-bottom:1px solid #EEE;padding:0px;" cellspacing="0" cellpadding="3" border="0"><caption style="position:relative;
            text-align:left;
            background-repeat:no-repeat;
            color:#253441;
            font-weight:bold;
            clear:none;
            overflow:hidden;
            padding:0px;
            padding-top:10px;
            padding-left:1px;
            margin:0px;
            white-space:pre;"><span id="t0" class="activeTableTab" style="white-space:nowrap;padding-top:0px;padding-left:0px;padding-right:0px;padding-bottom:7px;display:inline;float:none;background-color:#F8981D;border:none;height:16px;background-image:none;"><span style="white-space:nowrap;padding-top:5px;padding-left:12px;padding-right:12px;padding-bottom:7px;display:inline-block;float:left;background-color:#F8981D;border:none;height:16px;margin-right:3px;">All Methods</span></span><span id="t1" class="tableTab" style="white-space:nowrap;padding-top:0px;padding-left:0px;padding-right:0px;padding-bottom:7px;display:inline;float:none;background-color:#F8981D;border:none;height:16px;background-image:none;"><span style="white-space:nowrap;padding-top:5px;padding-left:12px;padding-right:12px;padding-bottom:7px;display:inline-block;float:left;background-color:#4D7A97;border:none;height:16px;margin-right:3px;">[Static Methods](javascript:show(1);)</span></span><span id="t4" class="tableTab" style="white-space:nowrap;padding-top:0px;padding-left:0px;padding-right:0px;padding-bottom:7px;display:inline;float:none;background-color:#F8981D;border:none;height:16px;background-image:none;"><span style="white-space:nowrap;padding-top:5px;padding-left:12px;padding-right:12px;padding-bottom:7px;display:inline-block;float:left;background-color:#4D7A97;border:none;height:16px;margin-right:3px;">[Concrete Methods](javascript:show(8);)</span></span></caption>

        <tbody>

        <tr>

        <th class="colFirst" scope="col" style="vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;background:#dee3e9;text-align:left;padding:8px 3px 3px 7px;white-space:nowrap;font-size:13px;width:25%;">Modifier and Type</th>

        <th class="colLast" scope="col" style="vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;background:#dee3e9;text-align:left;padding:8px 3px 3px 7px;font-size:13px;">Method and Description</th>

        </tr>

        <tr id="i0" class="altColor" style="background-color:#FFFFFF;">

        <td class="colFirst" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;white-space:nowrap;font-size:13px;width:25%;">`static java.lang.String`</td>

        <td class="colLast" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;font-size:13px;">`<span class="memberNameLink" style="font-weight:bold;">[decrypt](../../kare/encryption/RSA.html#decrypt-java.security.PrivateKey-java.lang.String-)</span>(java.security.PrivateKey key, java.lang.String encryptedData)`

        <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;padding-top:0px;">The method that will decrypt a base64 encoded encrypted String.</div>

        </td>

        </tr>

        <tr id="i1" class="rowColor" style="background-color:#EEEEEF;">

        <td class="colFirst" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;white-space:nowrap;font-size:13px;width:25%;">`static java.lang.String`</td>

        <td class="colLast" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;font-size:13px;">`<span class="memberNameLink" style="font-weight:bold;">[encrypt](../../kare/encryption/RSA.html#encrypt-java.security.PublicKey-java.lang.String-)</span>(java.security.PublicKey key, java.lang.String data)`

        <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;padding-top:0px;">The method that will encrypt a String.</div>

        </td>

        </tr>

        <tr id="i2" class="altColor" style="background-color:#FFFFFF;">

        <td class="colFirst" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;white-space:nowrap;font-size:13px;width:25%;">`static java.security.KeyPair`</td>

        <td class="colLast" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;font-size:13px;">`<span class="memberNameLink" style="font-weight:bold;">[generateKeyPair](../../kare/encryption/RSA.html#generateKeyPair--)</span>()`

        <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;padding-top:0px;">The method that will generate a RSA private public key pair of bit length 2048.</div>

        </td>

        </tr>

        <tr id="i3" class="rowColor" style="background-color:#EEEEEF;">

        <td class="colFirst" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;white-space:nowrap;font-size:13px;width:25%;">`static java.security.KeyPair`</td>

        <td class="colLast" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;font-size:13px;">`<span class="memberNameLink" style="font-weight:bold;">[generateKeyPair](../../kare/encryption/RSA.html#generateKeyPair-int-)</span>(int keyLength)`

        <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;padding-top:0px;">The method that will generate a RSA private public key pair.</div>

        </td>

        </tr>

        <tr id="i4" class="altColor" style="background-color:#FFFFFF;">

        <td class="colFirst" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;white-space:nowrap;font-size:13px;width:25%;">`static java.security.PrivateKey`</td>

        <td class="colLast" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;font-size:13px;">`<span class="memberNameLink" style="font-weight:bold;">[importPrivateKey](../../kare/encryption/RSA.html#importPrivateKey-java.lang.String-)</span>(java.lang.String filePath)`

        <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;padding-top:0px;">The method that will import a RSA private key from a .key file which is in the PKCS #8 - pem format.</div>

        </td>

        </tr>

        <tr id="i5" class="rowColor" style="background-color:#EEEEEF;">

        <td class="colFirst" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;white-space:nowrap;font-size:13px;width:25%;">`static java.security.PublicKey`</td>

        <td class="colLast" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;font-size:13px;">`<span class="memberNameLink" style="font-weight:bold;">[importPublicKey](../../kare/encryption/RSA.html#importPublicKey-java.lang.String-)</span>(java.lang.String filePath)`

        <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;padding-top:0px;">The method that will import a RSA public key from a .key file which is in the PKCS #8 - pem format.</div>

        </td>

        </tr>

        <tr id="i6" class="altColor" style="background-color:#FFFFFF;">

        <td class="colFirst" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;white-space:nowrap;font-size:13px;width:25%;">`static boolean`</td>

        <td class="colLast" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;font-size:13px;">`<span class="memberNameLink" style="font-weight:bold;">[savePrivateKey](../../kare/encryption/RSA.html#savePrivateKey-java.security.PrivateKey-java.lang.String-)</span>(java.security.PrivateKey privateKey, java.lang.String fileSavePath)`

        <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;padding-top:0px;">The method that will save a RSA private key in a .key file in the PKCS #8 - pem format.</div>

        </td>

        </tr>

        <tr id="i7" class="rowColor" style="background-color:#EEEEEF;">

        <td class="colFirst" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;white-space:nowrap;font-size:13px;width:25%;">`static boolean`</td>

        <td class="colLast" style="text-align:left;padding:0px 0px 12px 10px;vertical-align:top;padding-right:0px;padding-top:8px;padding-bottom:3px;font-size:13px;">`<span class="memberNameLink" style="font-weight:bold;">[savePublicKey](../../kare/encryption/RSA.html#savePublicKey-java.security.PublicKey-java.lang.String-)</span>(java.security.PublicKey publicKey, java.lang.String fileSavePath)`

        <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;padding-top:0px;">The method that will save a public key in a .key file PKCS #8 - pem format.</div>

        </td>

        </tr>

        </tbody>

        </table>

        *   <a name="methods.inherited.from.class.java.lang.Object" style="color:#353833;"></a>

            ### Methods inherited from class java.lang.Object

            `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

</div>

<div class="details">

*   *   <a name="method.detail" style="color:#353833;"></a>

        ### Method Detail

        <a name="generateKeyPair-int-" style="color:#353833;"></a>
        *   #### generateKeyPair

            <pre style="font-family:'DejaVu Sans Mono', monospace;
                font-size:14px;">public static java.security.KeyPair generateKeyPair(int keyLength)</pre>

            <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">The method that will generate a RSA private public key pair.</div>

            <dl>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="paramLabel" style="font-weight:bold;">Parameters:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`keyLength` - The is the bit length of the key.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="returnLabel" style="font-weight:bold;">Returns:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">The generated key pair in the form of `KeyPair`, otherwise `null` if key generation could not be performed.</dd>

            </dl>

            <a name="generateKeyPair--" style="color:#353833;"></a>
        *   #### generateKeyPair

            <pre style="font-family:'DejaVu Sans Mono', monospace;
                font-size:14px;">public static java.security.KeyPair generateKeyPair()</pre>

            <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">The method that will generate a RSA private public key pair of bit length 2048.</div>

            <dl>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="returnLabel" style="font-weight:bold;">Returns:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">The generated 2048 bit size key pair in the form of `KeyPair`, otherwise `null` if key generation could not be performed.</dd>

            </dl>

            <a name="savePublicKey-java.security.PublicKey-java.lang.String-" style="color:#353833;"></a>
        *   #### savePublicKey

            <pre style="font-family:'DejaVu Sans Mono', monospace;
                font-size:14px;">public static boolean savePublicKey(java.security.PublicKey publicKey,
                                                java.lang.String fileSavePath)
                                         throws java.security.NoSuchAlgorithmException,
                                                java.io.IOException,
                                                OperatorCreationException,
                                                java.security.spec.InvalidKeySpecException</pre>

            <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">The method that will save a public key in a .key file PKCS #8 - pem format.</div>

            <dl>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="paramLabel" style="font-weight:bold;">Parameters:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`publicKey` - The `PublicKey` that need to be saved in a .key file.</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`fileSavePath` - The path including the file name where the publicKey should be saved.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="returnLabel" style="font-weight:bold;">Returns:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`true` if the key is saved in a .key file successfully, otherwise `false`.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="throwsLabel" style="font-weight:bold;">Throws:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.NoSuchAlgorithmException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.io.IOException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`OperatorCreationException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.spec.InvalidKeySpecException`</dd>

            </dl>

            <a name="savePrivateKey-java.security.PrivateKey-java.lang.String-" style="color:#353833;"></a>
        *   #### savePrivateKey

            <pre style="font-family:'DejaVu Sans Mono', monospace;
                font-size:14px;">public static boolean savePrivateKey(java.security.PrivateKey privateKey,
                                                 java.lang.String fileSavePath)
                                          throws java.security.NoSuchAlgorithmException,
                                                 java.io.IOException,
                                                 OperatorCreationException,
                                                 java.security.spec.InvalidKeySpecException</pre>

            <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">The method that will save a RSA private key in a .key file in the PKCS #8 - pem format.</div>

            <dl>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="paramLabel" style="font-weight:bold;">Parameters:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`privateKey` - The `PrivateKey` that need to be saved in a .key file.</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`fileSavePath` - The path including the file name where the privateKey should be saved.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="returnLabel" style="font-weight:bold;">Returns:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`true` if the key is saved in a .key file successfully, otherwise `false`.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="throwsLabel" style="font-weight:bold;">Throws:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.NoSuchAlgorithmException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.io.IOException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`OperatorCreationException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.spec.InvalidKeySpecException`</dd>

            </dl>

            <a name="importPublicKey-java.lang.String-" style="color:#353833;"></a>
        *   #### importPublicKey

            <pre style="font-family:'DejaVu Sans Mono', monospace;
                font-size:14px;">public static java.security.PublicKey importPublicKey(java.lang.String filePath)
                                                           throws java.io.FileNotFoundException,
                                                                  java.io.IOException,
                                                                  java.security.NoSuchAlgorithmException,
                                                                  java.security.NoSuchProviderException,
                                                                  java.security.spec.InvalidKeySpecException</pre>

            <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">The method that will import a RSA public key from a .key file which is in the PKCS #8 - pem format.</div>

            <dl>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="paramLabel" style="font-weight:bold;">Parameters:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`filePath` - The file path including the file name where the public key to be imported is located.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="returnLabel" style="font-weight:bold;">Returns:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">The imported public key in the formt of `PublicKey` if the key is imported successfully, otherwise `null`.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="throwsLabel" style="font-weight:bold;">Throws:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.io.FileNotFoundException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.io.IOException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.NoSuchAlgorithmException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.NoSuchProviderException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.spec.InvalidKeySpecException`</dd>

            </dl>

            <a name="importPrivateKey-java.lang.String-" style="color:#353833;"></a>
        *   #### importPrivateKey

            <pre style="font-family:'DejaVu Sans Mono', monospace;
                font-size:14px;">public static java.security.PrivateKey importPrivateKey(java.lang.String filePath)
                                                             throws java.io.FileNotFoundException,
                                                                    java.io.IOException,
                                                                    java.security.NoSuchAlgorithmException,
                                                                    java.security.NoSuchProviderException,
                                                                    java.security.spec.InvalidKeySpecException</pre>

            <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">The method that will import a RSA private key from a .key file which is in the PKCS #8 - pem format.</div>

            <dl>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="paramLabel" style="font-weight:bold;">Parameters:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`filePath` - The file path including the file name where the private key to be imported is located.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="returnLabel" style="font-weight:bold;">Returns:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">The imported private key in the formt of `PrivateKey` if the key is imported successfully, otherwise `null`.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="throwsLabel" style="font-weight:bold;">Throws:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.io.FileNotFoundException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.io.IOException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.NoSuchAlgorithmException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.NoSuchProviderException`</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`java.security.spec.InvalidKeySpecException`</dd>

            </dl>

            <a name="encrypt-java.security.PublicKey-java.lang.String-" style="color:#353833;"></a>
        *   #### encrypt

            <pre style="font-family:'DejaVu Sans Mono', monospace;
                font-size:14px;">public static java.lang.String encrypt(java.security.PublicKey key,
                                                   java.lang.String data)</pre>

            <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">The method that will encrypt a String.</div>

            <dl>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="paramLabel" style="font-weight:bold;">Parameters:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`key` - The `PublicKey` used to encrypt the data.</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`data` - The data in the form of a String.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="returnLabel" style="font-weight:bold;">Returns:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">The encrypted base64 encoded String, otherwise `null` if encryption could not be performed.</dd>

            </dl>

            <a name="decrypt-java.security.PrivateKey-java.lang.String-" style="color:#353833;"></a>
        *   #### decrypt

            <pre style="font-family:'DejaVu Sans Mono', monospace;
                font-size:14px;">public static java.lang.String decrypt(java.security.PrivateKey key,
                                                   java.lang.String encryptedData)</pre>

            <div class="block" style="display:block;margin:3px 10px 2px 0px;color:#474747;font-size:14px;font-family:'DejaVu Serif', Georgia, &quot;Times New Roman&quot;, Times, serif;">The method that will decrypt a base64 encoded encrypted String.</div>

            <dl>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="paramLabel" style="font-weight:bold;">Parameters:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`key` - The `PrivateKey` used to decrypt the data.</dd>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">`encryptedData` - The encrypted in the form of base64 encoded String.</dd>

            <dt style="font-size:12px;
                font-weight:bold;
                margin:10px 0 0 0;
                color:#4E4E4E;"><span class="returnLabel" style="font-weight:bold;">Returns:</span></dt>

            <dd style="margin:5px 0 10px 0px;
                font-size:14px;
                font-family:'DejaVu Sans Mono',monospace;">The decrypted data in the form of String, otherwise `null` if decryption could not be performed.</dd>

            </dl>

</div>

</div>