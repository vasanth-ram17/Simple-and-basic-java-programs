/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

/**
 *
 * @author Vasanth
 */
public class fibonacci_series {
     public static void main(String[] arg){
        int a=1;
        int b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<10;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
        }

