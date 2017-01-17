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
public class Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number");
        int x = input.nextInt();
        System.out.print("reversed number is:");
        while (x != 0) {
            int num = x % 10;
            System.out.print(num);
            x = x / 10;
        }
    }
}
