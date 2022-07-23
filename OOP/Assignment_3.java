package All_Assignment;

/*
    Name : Yash Wanve
    ROLL no: A09
    Class : SEIT
 */
import java.util.Scanner;
class employee
{
    String name,address,mailid;
    long mobilno;
    int empid,BP;

    void salary()
    {
        double da,hra,pf,cf,gross_salary,net_salary;
        da=BP*0.97;
        hra=BP*10/100;
        pf=BP*12/100;
        cf=BP*0.1/100;

        gross_salary=BP+da+hra+pf+cf;
        System.out.println("Gross salary is "+ gross_salary);

        net_salary=gross_salary-pf-cf;
        System.out.println("Net salary is"+net_salary);


    }
}
class Programmer extends employee
{
    Programmer(String N,String A,String M,long MN,int E,int B )
    {
        name=N;address=A;mailid=M;
        mobilno=MN;empid=E;BP=B;

    }
}
class TeamLeader extends employee
{
    TeamLeader(String N,String A,String M,long MN,int E,int B )
    {
        name=N;address=A;mailid=M;
        mobilno=MN;empid=E;BP=B;
    }
}
class APmanager extends employee
{
    APmanager(String N,String A,String M,long MN,int E,int B )
    {
        name=N;address=A;mailid=M;
        mobilno=MN;empid=E;BP=B;
    }
}
class Projectmanager extends employee
{
    Projectmanager(String N,String A,String M,long MN,int E,int B )
    {
        name=N;address=A;mailid=M;
        mobilno=MN;empid=E;BP=B;
    }
}
public class Assignment_3

{
    public static void main(String args[])
    {

        String a,b,c;
        long d;
        int e,f;
        int choice, count;
        do
        {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter your choice \t 1.Programmer \t 2.TeamLeader \t 3.APmanager \t 4.Projectmanager");
            choice=scan.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("enter Programmer");
                    System.out.print("name ");
                    a=scan.next();
                    System.out.print("address ");
                    b=scan.next();
                    System.out.print("mailid ");
                    c=scan.next();
                    System.out.print("mobilno ");
                    d=scan.nextLong();
                    System.out.print("empid ");
                    e=scan.nextInt();
                    System.out.print("basicpay ");
                    f=scan.nextInt();
                    Programmer p = new Programmer(a,b,c,d,e,f);
                    p.salary();

                    break;
                }
                case 2:
                {
                    System.out.println("");
                    System.out.println("TeamLeader");
                    System.out.print("name ");
                    a=scan.next();
                    System.out.print("address ");
                    b=scan.next();
                    System.out.print("mailid ");
                    c=scan.next();
                    System.out.print("mobilno ");
                    d=scan.nextLong();
                    System.out.print("empid ");
                    e=scan.nextInt();
                    System.out.print("basicpay ");
                    f=scan.nextInt();
                    TeamLeader tl= new TeamLeader(a,b,c,d,e,f);
                    tl.salary();
                    break;
                }
                case 3:
                {
                    System.out.println("");
                    System.out.println("enter  APmanager");
                    System.out.print("name ");
                    a=scan.next();
                    System.out.print("address ");
                    b=scan.next();
                    System.out.print("mailid ");
                    c=scan.next();
                    System.out.print("mobilno ");
                    d=scan.nextLong();
                    System.out.print("empid ");
                    e=scan.nextInt();
                    System.out.print("basicpay ");
                    f=scan.nextInt();
                    APmanager apm = new APmanager(a,b,c,d,e,f);
                    apm.salary();
                    break;
                }
                case 4:
                {
                    System.out.println("");
                    System.out.println("enter Projectmanager");
                    System.out.print("name ");
                    a=scan.next();
                    System.out.print("address ");
                    b=scan.next();
                    System.out.print("mailid ");
                    c=scan.next();
                    System.out.print("mobilno ");
                    d=scan.nextLong();
                    System.out.print("empid ");
                    e=scan.nextInt();
                    System.out.print("basicpay ");
                    f=scan.nextInt();
                    Projectmanager pm = new Projectmanager(a,b,c,d,e,f);
                    pm.salary();
                    break;
                }
                case 5:
                    System.out.println("exit");
            }
            System.out.print("enter 1 to continue ");
            count=scan.nextInt();
        }while(count==1);

    }
}
