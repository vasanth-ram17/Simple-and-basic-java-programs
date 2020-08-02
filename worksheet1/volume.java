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
public class volume {
    public static void main(String[] args){
        volumeout obj=new volumeout();
        obj.depth=1;
        obj.height=2;
        obj.width=3;
        obj.volume();
        volumeout obj1=new volumeout();
        obj1.depth=10;
        obj1.height=20;
        obj1.width=30;
        obj1.volume();
    }
}
class volumeout
{
    double depth;
    double height;
    double width;
    public void volume()
    {
        double vol;
        vol=depth*height*width;
        System.out.println("Volume:"+vol);
    }
}
