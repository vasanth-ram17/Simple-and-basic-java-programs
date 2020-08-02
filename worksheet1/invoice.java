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
public class invoice {
    public static void main(String[] args){  
        customer c1=new customer(19,"SONAL",10);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        c1.setdiscount(50);
        System.out.println(c1.getdiscount());
        System.out.println(c1);

        invoice1 in=new invoice1(100,c1,3000);
        customer c2=new customer(3,"SHIBANI",20);
        System.out.println(in.getdata());
        System.out.println(in.getcustomer());
        System.out.println(in.getamount());
        in.setamount(40);
        in.setcustomer(c2);
        System.out.println(in.getcustomername());
        System.out.println(in.getamountafterdiscount());
    }
}
class customer
{
    int id;
    String name;
    int discount;
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        discount=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdiscount()
    {
        return discount;
    }
    void setdiscount(int d1)
    {
        discount=d1;
    }
    public String tostring()
    {
        return "Name:"+name+"\nID:"+id+"\nDiscount:"+discount;
    }        
}
class invoice1
{
    int id;
    customer o;
    double amount;
    invoice1(int i,customer o1,double a)
    {
        id=i;
        o=o1;
        amount=a;
    }
    customer getcustomer()
    {
        return o;
    }
    int getdata()
    {
        return id;
    } 
    double getamount()
    {
        return amount;
    }
    void setcustomer(customer o2)
    {
        o=o2;
    }
    void setamount(double a1)
    {
        amount=a1;
    }
    String getcustomername()
    {
        return o.name;
    }
    double getamountafterdiscount()
    {
        return amount-(amount)*o.discount/100;            
    }
}
