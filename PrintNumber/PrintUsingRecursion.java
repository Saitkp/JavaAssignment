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
public class PrintUsingRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number");
        int x = input.nextInt();
        display(x);
    }

    public static void display(int num) {
        if (num > 1) {
            display(num - 1);
        }
        System.out.println(num);
    }
}
