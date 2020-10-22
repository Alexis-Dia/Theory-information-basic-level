package com.md5.example1;

import com.md5.example1.utils.MD5Util;

/**
 * @author Alexey Druzik on 22.10.2020
 * This example from https://devcolibri.com/md5-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-%D0%B2-java/
 */
public class MD5Example {

    public static void main(String[] args) {

        String st = "AlexD";
        String st2 = "AlexD";
        String st3 = new String("AlexD");
        System.out.println("Custom MD5:");
        System.out.println(MD5Util.md5Custom(st));
        System.out.println("Custom MD5:");
        System.out.println(MD5Util.md5Custom(st2));
        System.out.println("Custom MD5:");
        System.out.println(MD5Util.md5Custom(st3));
        System.out.println("Apache MD5:");
        System.out.println(MD5Util.md5Apache(st));
    }

}
