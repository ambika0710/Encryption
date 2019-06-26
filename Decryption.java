package com.example.nic.encryptionsha512;

import java.io.UnsupportedEncodingException;
public  class Decryption
{
    public static String Decryptdata(String encryptcontent) throws UnsupportedEncodingException {
        byte[] data = android.util.Base64.decode(encryptcontent, android.util.Base64.DEFAULT);
       String decodevalue = new String(data, "UTF-8");
        return decodevalue;
        
    }
}