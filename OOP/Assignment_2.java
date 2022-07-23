import java.util.Scanner;
class Publication {
    private String title;
    private int price, copies, total;


    Scanner sc = new Scanner(System.in);

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getCopies() {
        return copies;
    }

    public int getTotal() {
        return total;
    }

    public void read_pub1() {
        System.out.print("enter title : ");
        title = sc.next();
        System.out.print("enter price : ");
        price = sc.nextInt();
        System.out.print("enter copies : ");
        copies = sc.nextInt();
    }

    void display() {
        System.out.println(title + "\t" + price + "\t" + copies);
    }

    void sale_copy(int num) {
        if (num <= copies) {
            copies = copies - num;
            total = total + num * price;
            var i = price * num;
            System.out.println("\t You Purchased " + num + " Copies\n\tYou Have To Pay : " + (price * num));
        } else
            System.out.println("   Insufficent Stock!!!!!!!!");
    }
}


class Book extends Publication
{
    private String author;

    void order_copies(int num)
    {
        int a=getCopies()+num;//As data member are private we access them with the help of methods
        setCopies(getCopies()+num);
        System.out.println("\n\t Order successful  ");
        System.out.println("\tCopies are Available : "+a);
    }
    void read_book()
    {
        read_pub1();
        System.out.print("enter author book : ");
        author=sc.next();
    }
    void display_book()
    {
        System.out.println("title\tprice\tcopy\tauthor");
        display();
        System.out.println("\t"+author);
    }
}
class Magazine extends Publication {
    private int order_qty;
    private String issue_date;

    void recive_issue(String new_issue) {
        System.out.println("enter new copies to order ");
        order_qty = sc.nextInt();
        setCopies(order_qty);
        issue_date = new_issue;
        System.out.println("\t Magazine " + getTitle() + "\n\t with issue date" + issue_date + "available");
    }

    void read_mag() {
        read_pub1();
        System.out.print("Enter the Current issue date[dd/mm/yyyy]");
        issue_date = sc.next();
    }

    void display_mag() {
        System.out.println("title\t price \t copies \t date");
        display();
        System.out.println("\t" + issue_date);
    }
}


public class Assignment_2
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        Book b = new Book();
        Magazine m = new Magazine();
        int out = 0;
        do {

            System.out.println("\n\n\tCHOOSE ONE OF THE FOLLOWING....\n\n\t1.BOOK \t\t\t2.MAGAZINE"
                    + "\n\n\t3.TOTAL SALE AMOUNT\t4.REVENUE OF PUBLICATION\n\n");
            System.out.print("Choice::");
            int k=sc.nextInt();
            int a;


            if(k==1) {


                do {
                    int c;
                    System.out.print("\n\t\tMENU   FOR   BOOK\n");
                    System.out.print("\t1.read book \t\t2.display \n\t3.sale copies \t\t4.order copies");
                    System.out.print("\n\tChoice::");
                    c=sc.nextInt();
                    switch (c){

                        case 1:
                            b.read_book();
                            break;
                        case 2:
                            b.display_book();
                            break;
                        case 3:
                            System.out.print("HOW MANY COPIES YOU WANT : ");
                            int n1=sc.nextInt();
                            b.sale_copy(n1);
                            break;
                        case 4:
                            System.out.print("ENTER COPIES WANT TO ORDER(for shop): ");
                            int n2=sc.nextInt();
                            b.order_copies(n2);
                            break;
                        default:
                            System.out.println("invalid");

                    }
                    System.out.println("Do you want to continue with book section[1/0]\n\t1.YES \t\t0.NO");
                    System.out.print("\tChoice::");
                    a=sc.nextInt();
                    if(a==0)
                        break ;

                }while(a==1);

            }
            else if(k==2)
            {
                do {
                    System.out.println("\n\t\tMENU   FOR   MAGAZINE...\n\n\t1.READ  \t\t2.DISPLAY \n\t3.SALE MAGAZINE COPIES \t4.RECEIVE NEW ISSUE\n");
                    int d;
                    System.out.print("\n\tChoice::");
                    d=sc.nextInt();
                    switch(d) {
                        case 1:
                            m.read_mag();
                            break;
                        case 2:
                            m.display_mag();
                            break;
                        case 3:

                            System.out.println("HOW MANY COPIES YOU WANT(customer)??  ");
                            int n3=sc.nextInt();
                            m.sale_copy(n3);

                            break;
                        case 4:

                            System.out.println("ENTER THE NEW ISSUE DATE [dd/mm/yyyy]: ");
                            String date=sc.next();
                            m.recive_issue(date);

                            break;
                    }
                    System.out.println("DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]\n\t1.YES\t0.NO");
                    System.out.print("\tChoice::");
                    a=sc.nextInt();
                    if(a==0)
                        break ;

                }while(a==1);
            }

            else if (k==3) {
                System.out.println("\n\tTOTAL SALE AMOUNT IS(to be paid by customer)  = "+(b.getTotal()+m.getTotal())+ "  ");
            }

            else if(k==4) {
                System.out.println("\n\tTOTAL REVENUE OF PUBLICATION IS  :  "+ (b.getCopies()*b.getPrice() + m.getCopies()*m.getPrice()));
            }

            else
                System.out.println("invalid key....");
            System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION???\n\t1.CONTINUE \t0.EXIT");
            a=sc.nextInt();
        }while(out!=0);
        sc.close();
    }
}
