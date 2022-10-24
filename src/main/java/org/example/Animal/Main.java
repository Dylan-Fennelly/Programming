package org.example.Animal;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        testAnimals();
    }

    private static void testAnimals()
    {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Brown");
        Dog honey = new Dog("Honey",colours,false,8,
                12,"Dog","King Charles Cavilier",
                true,true,true,
                false);
        honey.eat();
        ArrayList<String> fishColours = new ArrayList<>();
        fishColours.add("Orange");
//        Fish bob = new Fish("Bob",fishColours,true,.09,1,"Fish",)
    }
}
