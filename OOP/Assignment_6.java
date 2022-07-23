/*
    Name : Yash Wanve
    ROLL no: A09
    Class : SEIT
 */

import java.util.Scanner;

interface Vehicle
{

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle
{

    int speed;
    int gear;

    public void changeGear(int newGear)
    {

        gear = newGear;
    }


    public void speedUp(int increment)
    {

        speed = speed + increment;
    }


    public void applyBrakes(int decrement)
    {

        speed = speed - decrement;
    }

    public void printStates()
    {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements Vehicle
{

    int speed;
    int gear;


    public void changeGear(int newGear)
    {

        gear = newGear;
    }


    public void speedUp(int increment)
    {

        speed = speed + increment;
    }

    public void applyBrakes(int decrement)
    {

        speed = speed - decrement;
    }

    public void printStates()
    {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}
class Car implements Vehicle
{

    int speed;
    int gear;


    public void changeGear(int newGear)
    {

        gear = newGear;
    }


    public void speedUp(int increment)
    {

        speed = speed + increment;
    }

    public void applyBrakes(int decrement)
    {

        speed = speed - decrement;
    }

    public void printStates()
    {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}
public class Assignment_6 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Bicycle a = new Bicycle();

        System.out.println("----------BICYCLE----------");
        System.out.print("Enter Change In Gear  : ");
        a.changeGear(sc.nextInt());
        System.out.print("Enter Speed  ");
        a.speedUp(sc.nextInt());
        System.out.print("Enter speed after apply break");
        a.applyBrakes(sc.nextInt());

        System.out.println("Bicycle present state :");
        a.printStates();


        Bike b = new Bike();
        System.out.println("----------BIKE----------");
        System.out.print("Enter Change In Gear  : ");
        b.changeGear(sc.nextInt());
        System.out.print("Enter Speed  ");
        b.speedUp(sc.nextInt());
        System.out.print("Enter speed after apply break");
        b.applyBrakes(sc.nextInt());

        System.out.println("Bike present state :");
        b.printStates();

        Car c= new Car();
        System.out.println("----------CAR----------");
        System.out.print("Enter Change In Gear  : ");
        c.changeGear(sc.nextInt());
        System.out.print("Enter Speed  ");
        c.speedUp(sc.nextInt());
        System.out.print("Enter speed after apply break");
        c.applyBrakes(sc.nextInt());

        System.out.println("Car present state :");
        c.printStates();
    }
}