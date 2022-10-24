package com.program;
//Created by 21343017_Aldhy
public class L3_PerbandinganObjek {
    public static void main(String[] args) {
        String str1,str2;
        str1="Free the bount periodicals.";
        str2=str1;

        System.out.println("string 1 : "+str1);
        System.out.println("string 2 : "+str2);
        System.out.println("same object? "+(str1==str2));

        str2 = new String(str1);
        System.out.println("string 1 : "+str1);
        System.out.println("string 2 : "+str2);
        System.out.println("same object? "+(str1==str2));

        System.out.println("Same Value? "+str1.equals(str2));
    }
}
