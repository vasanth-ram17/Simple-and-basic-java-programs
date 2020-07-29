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
public class ascending_order {
     public static void main(String[] arg){
        int n,t;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;    
                }
            }
           
            }
        System.out.println("Ascending order is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+",");
        }
        System.out.println(a[n-1]);
        }
}
