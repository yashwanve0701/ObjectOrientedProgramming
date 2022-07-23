/*
    Name : Yash Wanve
    ROLL no: A09
    Class : SEIT
 */
import java.util.*;

import java.util.Scanner;

import java.io.*;

import java.lang.*;

class OOPL
{


    public static < E > void Pallindrome(E o)
    {

        String A=(String)o;

        A=A.toLowerCase();

        StringBuffer  C= new StringBuffer(A);


        String B= new String(C.reverse());


        if(Objects.equals(A,B))

        {

            System.out.println(o+" is Pallindrome");
        }

        else

        {

            System.out.println(o+" is not Pallindrome");
        }

    }



    public static <E>void even_odd(E a)
    {

        if((int)a%2==0)

        {

            System.out.println(a+" is Even Number.");

        }

        else

        {

            System.out.println(a+" is Odd Number.");

        }

    }


    public static <E>void prime(int a)
    {
        int aa;

        for(aa=2;aa<=a-1;aa++)

        {
            if(a%2==0)

            {

                break ;

            }

        }

        if(aa==a)

        {
            System. out. println(a+"   is  The Prime  Number ");

        }

        else

        {

            System. out. println(a+"    is   Not    The  Prime   Number ");

        }

    }


}


public class
Assignment_7
{

    public static void main(String[] args)
    {
        String A;

        int  a;

        do

        {

            Scanner AG =new Scanner(System.in);

            System.out.println(" Enter  Your  choice \n       1 String : = :\n       2   Integer : =  : ");


            int A1 =AG.nextInt();


            switch(A1)
            {

                case 1:
                {
                    System.out.print("Enter the String :: ");

                    A=AG.next();

                    OOPL.Pallindrome(A);

                }

                System. out. println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                break;


                case 2:

                {

                    System.out.print("Enter the Integer :: ");

                    A=AG.next();

                    OOPL.Pallindrome(A);

                    OOPL.even_odd(Integer.parseInt(A));

                    OOPL.prime(Integer.parseInt(A));

                }

                System. out. println("************************************************************");

                break;

            }
            System. out. println("Enter 99  For Next ");

            a=AG. nextInt();

            System. out. println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");


        }while(a==99);

    }

}

