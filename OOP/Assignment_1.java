
/*
    Name : Yash Wanve
    ROLL no: A09
    Class : SEIT
 */
import java.util.Scanner;

class Complex_no
{
    float real,img;

    public Complex_no()//default constructor
    {
        real=0;
        img=0;
    }
    public Complex_no(float r,float i)//parameterized constructor
    {
        real=r;
        img=i;
    }
    public void display(Complex_no c1,Complex_no c2)
    {
        System.out.println("Enter first complex no "+c1.real + "+" + c1.img+"i");
        System.out.println("Enter second complex no "+c2.real + "+" + c2.img+"i");
    }
    public void add(Complex_no c1,Complex_no c2)
    {
        real=c1.real+c2.real;
        img=c1.img+c2.img;
        System.out.println("Addition of two Complex nos. is "+ real + "+"+ img +"i");
    }
    public void sub(Complex_no c1,Complex_no c2)
    {
        real=c1.real-c2.real;
        img=c1.img-c2.img;
        System.out.println("Substraction of two Complex nos. is "+real+"+"+img+"i");
    }
    public void multi(Complex_no c1,Complex_no c2)
    {
        real=c1.real*c2.real;
        img=c1.img*c2.img;
        System.out.println("Multiplication of two Complex nos. is "+ real+"+"+img+"i");
    }
    public void division(Complex_no c1,Complex_no c2)
    {
        real=c1.real/c2.real;
        img=c1.img/c2.img;
        System.out.println("Division of two Complex nos. is "+real+"+"+img+"i");
    }
}
public class Assignment_1
{
    public static void main(String []args)
    {
        float n1 = 0,n2=0;
        Scanner sc= new Scanner(System.in);
        Complex_no c= new Complex_no();
        System.out.println("COMPLEX NUMBER : a+bi ");
        System.out.print("Enter real and imaginary part of 1st complext no. :");
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        Complex_no c1 = new Complex_no(n1,n2);

        System.out.print("Enter real and imaginary part of 2nd complex no. :");
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        Complex_no c2= new Complex_no(n1,n2);

        c.display(c1,c2);
        c.add(c1,c2);
        c.sub(c1,c2);
        c.multi(c1,c2);
        c.division(c1,c2);



    }
}
//OUTPUT
/*COMPLEX NUMBER : a+bi
        Enter real and imaginary part of 1st complext no. :21 45
        Enter real and imaginary part of 2nd complex no. :10 4
        Enter first complex no 21.0+45.0i
        Enter second complex no 10.0+4.0i
        Addition of two Complex nos. is 11.0+41.0i
        Substraction of two Complex nos. is 11.0+41.0i
        Multiplication of two Complex nos. is 210.0+180.0i
        Division of two Complex nos. is 2.1+11.25i*/