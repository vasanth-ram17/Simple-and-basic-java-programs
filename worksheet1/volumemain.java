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
public class volumemain {
     public static void main(String[] args){
        volumein obj=new volumein();
        obj.depth=1;
        obj.height=2;
        obj.width=3;
        double vol=obj.depth*obj.height*obj.width;
        System.out.println("Volume:"+vol);
    }
}
class volumein
{
    double depth;
    double height;
    double width;
} 

