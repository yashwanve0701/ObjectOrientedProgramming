/*
    Name : Yash Wanve
    ROLL no: A09
    Class : SEIT
 */

import java.util.Scanner;
abstract class Shape
{
    double val1,val2;
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter first value: ");
        val1=s.nextDouble();
        System.out.print("enter second value: ");
        val2=s.nextDouble();
    }
    abstract void compute_area();
}
class triangle extends Shape
{
    void compute_area()
    {
        double area;
        area= 1.0f/2.0f*val1*val2;
        System.out.println("triangle area: "+area);
    }
}
class rectangle extends Shape
{
    void compute_area()
    {
        double area;
        area= val1*val2;
        System.out.println("rectangle area: "+area);
    }
}
public class Assignment_5
{
    public static void main(String[]args)
    {
        Shape s;
        triangle t=new triangle();
        rectangle r=new rectangle();
        s=t;
        s.input();
        s.compute_area();
        s=r;
        s.input();
        s.compute_area();
    }
}
