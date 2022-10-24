package org.example.classesconstructorsinheritance;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        testCar();
        testAccount();
        testVIP();
    }

    private static void testVIP()
    {
        VIP person1 = new VIP();
        System.out.println(person1.getName());
        VIP craig = new VIP("Craig",25000);
        System.out.println(craig.getName());
        VIP muhammad = new VIP("Muhammad",100,"Muhammad@gmail.com");
        System.out.println(muhammad.getEmailAddress());
    }

    private static void testAccount()
    {
        Account dylansAccount = new Account();
        System.out.println(dylansAccount.getNumber());
        System.out.println(dylansAccount.getBalance());

        dylansAccount.withdraw(100);
        dylansAccount.deposit(50);
        dylansAccount.withdraw(100);

    }

    private static void testCar()
    {
        Wheel tacomaWheel = new Wheel();
        Engine tacomaEngine = new Engine();
        ArrayList<String> tacomaAccessories = new ArrayList<>();
        tacomaAccessories.add("Aircon");
        Car myTacoma = new Car(tacomaWheel,5,"Toyota",
                4,"black",tacomaEngine,
                2022,2000,"Manual",
                "Duel exit",
                2,60000,"Tacoma",tacomaAccessories,1500,true,500,
                false);

        myTacoma.setModel("Tacoma");
        System.out.println(myTacoma);
    }

}
