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
public class StudentMarks {
      public static void main(String args[]){
        double maths,english,science,social,total;
        System.out.println("enter the marks subject wise");
        System.out.println("\n enter maths marks:");
        Scanner obj = new Scanner(System.in);
        maths = obj.nextDouble();
        System.out.println("enter english Marks");
        english = obj.nextDouble();
        System.out.println("enter science Marks");
        science = obj.nextDouble();
        System.out.println("enter social Marks");
        social =  obj.nextDouble();
        total = maths+english+science+social;
        System.out.println("totally you scored="+ total);
        if(total>450){
            System.out.println("congrats it is a distinction");}
        else if(total>400){
                System.out.println("congrats you scored a great mark");}
        else if(total > 300){
                System.out.println("it is a good mark");}
        else{
            System.out.println("try hard next time");}
}}
