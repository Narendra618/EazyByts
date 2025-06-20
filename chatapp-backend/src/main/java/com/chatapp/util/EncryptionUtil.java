package com.chatapp.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionUtil {

    private static final String AES = "AES";
    private static final String SECRET = "1234567890123456";

    public static String encrypt(String data) {
        try {
            SecretKeySpec key = new SecretKeySpec(SECRET.getBytes(), AES);
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
        } catch (Exception e) {
            return null;
        }
    }

    public static String decrypt(String encrypted) {
        try {
            SecretKeySpec key = new SecretKeySpec(SECRET.getBytes(), AES);
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)));
        } catch (Exception e) {
            return null;
        }
    }
}
