package com.caciopee.module.extern.encryption;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Encryptor x = new Encryptor();
        String res = x.getRandomName(5, "hamid");
        System.out.println(res);
        x.copy("E:\EncryptionApp\filesToEncrypt\WhatsApp Image 2022-06-27 at 7.09.58 PM","E:\EncryptionApp\encryptedFiles");
    }
}
