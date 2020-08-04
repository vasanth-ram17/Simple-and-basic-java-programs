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
public class command {
    public static void main(String args[]){
         Scanner obj = new Scanner(System.in);
         System.out.print("enter the input string: ");
         String a = obj.nextLine();
         String b = "my name is ";
         String c = b.concat(a);
         System.out.println(c);
         
        
             
         }
    }

