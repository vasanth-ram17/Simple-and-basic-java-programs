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
public class square_size {
     public static void main(String[] arg){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the side");
    int a=obj.nextInt();
    System.out.println("Perimeter of a square is:"+(4*a));
    }
    
}
