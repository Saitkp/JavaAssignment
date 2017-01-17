/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.*;

/**
 *
 * @author saitk
 */
public class Paranthesis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Integer> st = new Stack<Integer>();
        System.out.println("Please enter the expression");
        String input = scan.next();
        int lengthh = input.length();
        System.out.println("\nOutput Of Balanced Paranthesis\n");
        for (int i = 0; i < lengthh; i++) {
            char c = input.charAt(i);
            if (c == '(') {
                st.push(i);
            } else if (c == ')') {
                try {
                    int x = st.pop() + 1;
                    System.out.println("'(' at Position " + x + " matched with ')' at index " + (i + 1));
                } catch (Exception e) {
                    System.out.println("')' at Position " + (i + 1) + " is unmatched");
                }
            }
        }
        while (!st.isEmpty()) {
            System.out.println("'(' at Position " + (st.pop() + 1) + " is unmatched");
        }
    }
}
