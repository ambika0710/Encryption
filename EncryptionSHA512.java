package com.example.nic.encryptionsha512;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionSHA512 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encryption_sha512);
    }
}
    class SHA {
        static String securePassword = null;

        public static void main(String[] args) throws NoSuchAlgorithmException {
            String passwordToHash = "123456";
            // byte[] salt = getSalt();

            securePassword = get_SHA_512_SecurePassword(passwordToHash);
            //System.out.println(securePassword);
        }

        private static String get_SHA_512_SecurePassword(String passwordToHash) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] digest = md.digest(passwordToHash.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                sb.append(Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1));
            }
            securePassword = sb.toString();

            return securePassword;
        }
    }
