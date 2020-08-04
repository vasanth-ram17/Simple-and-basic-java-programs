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
public class array {
     public static void main(String args[]){
        int [] arr;
        int n,max,min;
        max = 0;
        min = 0;
                
        System.out.println("enter the number of elements");
        Scanner obj = new Scanner(System.in);
  
        n = obj.nextInt();
        arr = new int[100];
        System.out.println("enter the array ");
        for(int i = 0; i<n ; i++ ){
            arr[i] = obj.nextInt();
            if(arr[i]> max){
                max = arr[i];
            }
         
            
            }
        min = arr[0];
        for(int i =1; i<n; i++){
            if (arr[i]< min){
                min = arr[i];
            }
        }
            
        System.out.println("the biggest integer is" + max);
        System.out.println("the smallest integer is" + min);     
        }
}
