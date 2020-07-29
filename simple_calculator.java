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
public class simple_calculator {
     public static void main(String[] arg){
        int a=10,b=3;
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        switch(c)
        {
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            default:
            System.out.println("Incorrect option");
        }
    }
}
