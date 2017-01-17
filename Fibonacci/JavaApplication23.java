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
public class JavaApplication23 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World");
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n=input.nextInt();
        fibonacci(n);
    }
    
    public static void fibonacci(int x)
    {
        
        if(x==0)
        {
            System.out.println("please enter the value Greater than Zero");
            
        }
        
        else if(x==1)
                {
                    System.out.println("0");
                }
        else if(x==2)
         {
             System.out.println("0 1");
         }
      
        else
        {
            int a=0;
            int b=1;
            System.out.println("0");
            System.out.println("1");
            for(int i=1;i<=x-2;i++)
           {
              int c=a+b;
               System.out.println(c);
               a=b;
               b=c;
               
           }
          
        }
        
    }
    
    
}


