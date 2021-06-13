/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Palindrome {

    static boolean isPalindrome(String str) {

        int i = 0, j = (str.length() - 1);

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println("Given string is a palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }

    }

}
