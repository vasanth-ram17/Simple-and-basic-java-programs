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
public class sum_of_numbers {
    public  static void main(String[] arg){
        int n,s=0;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            s=s+obj.nextInt();
        }
        System.out.println("Sum of numbers is:"+s);               
    }
}
