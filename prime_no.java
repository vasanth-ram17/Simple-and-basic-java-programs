/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;
import java.util.Scanner;
/**
 *
 * @author Vasanth
 */
public class prime_no {
     public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    System.out.print("enter the number: ");
    int a = obj.nextInt();
    int f = 0;
    for(int i = 2; i <= a/2; ++i)
        {
            // condition for nonprime number
            if(a % i == 0)
            {
                f = 1;
                break;
            }
        }
    if(f==0){
        System.out.println("It is a prime number");
    }
    else{
         System.out.println("It is not a prime number");
    }

}}
