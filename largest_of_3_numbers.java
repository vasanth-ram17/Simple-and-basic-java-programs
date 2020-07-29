/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;
import java.util.Scanner;

/**
 *
 * @author Vasanth
 */
public class largest_of_3_numbers {
     public static void main(String[] arg){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Largest number is :"+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest is:"+c);
        }
     }}
