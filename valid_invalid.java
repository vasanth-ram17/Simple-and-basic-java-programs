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
public class valid_invalid {
      public static void main(String[] arg){
        Scanner obj=new Scanner(System.in);
        System.out.println("Press key");
        int a=obj.nextInt();
        switch(a)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("You pressed:"+a);
                break;
            default:
                System.out.println("You pressed incorrect option:"+a);
                
        }
    }
}
