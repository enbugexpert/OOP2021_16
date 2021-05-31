package com.OOP2021_16.util;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAUtil {

    public static String hash(String context){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return new BigInteger(1, md.digest(context.getBytes())).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

}