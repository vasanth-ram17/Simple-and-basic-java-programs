_/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

/**
 *
 * @author Vasanth
 */
public class power_of_a {
    public static void main(String[] arg){
        int n=2,b=3,s=1;
        for(int i=0;i<b;i++)
        {
            s=s*n;
        }
        System.out.println("Power of:"+n+"^"+b+"."+s);
    }
}
