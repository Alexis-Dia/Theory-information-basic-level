package com.md5.example2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Alexey Druzik on 22.10.2020
 * This example from https://javadevblog.com/prymer-heshyrovanyya-md5-v-java.html
 */
public class MD5Example {
    //текст для хеширования
    public static final String TEXT = "Prologistic.com.ua";

    public static void main(String[] args) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(TEXT.getBytes());

        byte byteData[] = md.digest();

        //конвертируем байт в шестнадцатеричный формат первым способом
        StringBuffer sb = new StringBuffer();
        for (byte aByteData : byteData) {
            sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println("Текст в шестнадцатеричном виде : " + sb.toString());

        //конвертируем байт в шестнадцатеричный формат вторым способом
        StringBuffer hexString = new StringBuffer();
        for (byte aByteData : byteData) {
            String hex = Integer.toHexString(0xff & aByteData);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        System.out.println("Текст в шестнадцатеричном виде : " + hexString.toString());
    }
}
