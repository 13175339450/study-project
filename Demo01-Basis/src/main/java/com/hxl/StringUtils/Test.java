package com.hxl.StringUtils;


import org.springframework.util.StringUtils;

public class Test {
    public static void main(String[] args) {
        String s1 = " ";
        String s2 = null;
        String s3 = "";
        String s4 = "hxl ";
        String s5 = "  hxl";
        String s6 = "  hx l ";
        System.out.println(StringUtils.hasText(s1));
        System.out.println(StringUtils.hasText(s2));
        System.out.println(StringUtils.hasText(s3));
        System.out.println(StringUtils.hasText(s4));
        System.out.println(StringUtils.hasText(s5));
        System.out.println(StringUtils.hasText(s6));
    }
}
