/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author saitk
 */
public class Strin {

    public static void main(String[] args) {
        String reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str1 = input.nextLine();
        int length = str1.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str1.charAt(i);
        }
        System.out.println("Reversed String is:" + reverse);

    }

}
