package com.company.LeetCode;

import java.util.Scanner;

public class Palindrome {
    public void palindromeProgram() {
        System.out.println("Enter any number to know if it is palindrome or not");
        Scanner number = new Scanner(System.in);
        int enterNumber = number.nextInt();
        boolean b = false;
        char[] seperatingInteger = String.valueOf(enterNumber).toCharArray();
        for (int i = 0, j = seperatingInteger.length - 1; i < (seperatingInteger.length / 2); ) {
            if (seperatingInteger[i] == seperatingInteger[j]) {
                i++;
                j--;
                b = true;
            }
            if (seperatingInteger[i] != seperatingInteger[j]) {
                b = false;
                break;
            }
        }
        if (b == false) System.out.println("Not Palindrome");
        if (b == true) System.out.println("Palindrome");
    }
}