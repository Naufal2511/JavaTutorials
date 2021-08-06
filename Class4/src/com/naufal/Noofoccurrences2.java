package com.naufal;

import java.util.Scanner;

public class Noofoccurrences2 {
    public static void main(String[] args) {
        String num ;
        int count = 0 ;
        Scanner in = new Scanner(System.in) ;
        num = in.next() ;
        char digit ;
        digit = in.next().trim().charAt(0) ;
        int i = 0 ;
        while( i < num.length())    {
            if(num.charAt(i) == digit)  {
                count++ ;
            }
            i++ ;
        }
        System.out.println("Count = " + count);
    }
}
