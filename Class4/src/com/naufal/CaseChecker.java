package com.naufal;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an alphabet !");
        char ch = in.next().trim().charAt(0) ;

        if(ch >= 'a' && ch <='z')   {
            System.out.println(ch + " is a lowercase character");
        }
        else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an upperCase character");
        }
        else    {
            System.out.println("You have not entered a character, Please try again !");
        }
    }
}
