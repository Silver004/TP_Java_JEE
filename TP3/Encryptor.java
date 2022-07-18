package com.caciopee.module.extern.encryption;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

//utils for encryption
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;



public class Encryptor {
    //static instance of the class
    private static Encryptor encryptor = new Encryptor();
    //boolean to choose the option to delete the original file
    private static boolean deleteOriginal;
    
    private Encryptor(){}
    //Delete this later
    //public Encryptor(){}
    public static Encryptor getEncryptor(boolean originalFileDeleted){
        deleteOriginal = originalFileDeleted;
        return encryptor;
    }

    

    public void encrypt(File sourceFile, File destinationFile) throws Exception{
        //Check if destinationFile exists or create the directory
        if(!destinationFile.exists()){
            destinationFile.mkdir();
        }
        //isDirectory() returns a boolean on wheter destinationFile is a directory or not
        if(!destinationFile.isDirectory()){
            return;
        }

        try{
            if(!sourceFile.isDirectory()){
                copyEncrypted(sourceFile, destinationFile);
            } else {
                File[] files = sourceFile.listFiles();
                System.out.println("Encrypting...");
                for(File file : files){
                    copyEncrypted(file, destinationFile);
                    if(deleteOriginal){
                        file.delete();
                    }
                }
                System.out.println("Files are enrypted!");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public void copyEncrypted(File source, File destination) throws Exception{
        InputStream inputStream = null;
        OutputStream outputStream= null;

        destination = new File(destination.getPath().concat("/").concat(getRandomName(10, "works")));

        try{
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(destination);

            outputStream.write(new byte[] { (byte) source.getName().length()});
            outputStream.write(stringToByte(source.getName()));

            byte[] buffer = new byte[1024];

            int length;
            while((length = inputStream.read(buffer)) > 0){
                encryptBytes(buffer);
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
    //Encryption algorithm AES (Advanced Enryption System)
    private void encryptBytes(byte[] data) throws Exception{
        encryptionCipher = 
    }

    public byte[] stringToByte(String data){
        char[] characters = data.toCharArray();
        byte[] result = new byte[characters.length*2];
        for(int i = 0; i <result.length; i++){
            // 0xff stands for 255 bytes
            result[i] = (byte) ((characters[i/2] >> (8 - (i % 2))) & 0xff);
        }
        return result;
    }

    //This method will create a random name for the encrypted file
    public String getRandomName(int length, String extension){
        Random random = new Random();
        StringBuilder resultString = new StringBuilder();
        for(int i = 0; i < length; i++){
            char character = 'a';
            int width = 'z' - 'a';
            if(random.nextInt(3) == 0){
                character = 'A';
                width = 'Z' - 'A';
            }
            if(random.nextInt(3) == 1){
                character = '0';
                width = '9' - '0';
            }
            resultString.append((char)(character + random.nextInt(width)));
        }
        resultString.append(".").append(extension);

        return resultString.toString();
    }

    //This method is used to copy files between 2 directories
    public void copy(File source, File destination) throws IOException{
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try{
            destination = new File(destination.getPath().concat("/").concat(source.getName()));
            
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(destination);

            byte[] buffer = new byte[1024];

            int length;
            int tl = 0;

            while((length = inputStream.read(buffer)) > 0){
                tl += length;
                outputStream.write(buffer, 0, length);
            }
            System.out.println(tl + " bytes");

        } finally{
            inputStream.close();
            outputStream.close();
        }
    }

}
