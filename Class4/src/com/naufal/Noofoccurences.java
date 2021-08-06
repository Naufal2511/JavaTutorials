package com.naufal;

import java.util.Scanner;

public class Noofoccurences {
    public static void main(String[] args) {
        long n ;
        Scanner in = new Scanner(System.in) ;
        System.out.print("Please enter the number : ");
        n = in.nextLong() ;
        int digit ;
        System.out.print("Please enter the digit whose occurrences you want to find out : ");
        digit = in.nextInt() ;
        int rem ;
        int count = 0 ;
        while(n != 0)    {
            rem = (int)(n%10) ;
            if(rem == digit)    {
                count++ ;
            }
            n = n / 10 ;
        }

        System.out.println("The number of occurrences of " + digit + " is equal to " + count);
    }
}
