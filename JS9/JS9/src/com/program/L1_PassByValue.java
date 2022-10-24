package com.program;
//Created by 21343017_Aldhy
public class L1_PassByValue {
    public static void main(String[] args) {
        int i=10;
        System.out.println(i);

        test(i);
        System.out.println(i+2);
    }

    public static void test (int j){
        j=33;
        System.out.println(j);
    }

}
