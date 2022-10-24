package com.program;
//Created by 21343017_Aldhy
public class L2_PassByReference {
    public static void main(String[] args) {
        int[] ages ={10,11,12};
        for (int i=0; 1<ages.length; i++){
        System.out.println(ages[i]);
        }

        test(ages);

        for (int i=0; 1<ages.length; i++){
            System.out.println(ages[i]);
        }
    }

    public static void test(int[] arr) {
        for (int i=0; 1 < arr.length; i++){
            arr[i]=i+50;
        }
    }
}
