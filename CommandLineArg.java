/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

/**
 *
 * @author Vasanth
 */
public class CommandLineArg {
     public static void main(String[] args) {
        // TODO code application logic her
        //taking value as command line argument.
        //Converting String format to Integer value
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        if(i> j)
            System.out.println(i+" is greater than "+j);
        else
            System.out.println(j+" is greater than "+i);
    }
}
