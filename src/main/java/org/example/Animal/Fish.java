package org.example.Animal;

import java.util.ArrayList;

public class Fish extends Animal
{
    private int gills;
    private int eyes;
    private int fins;
    private boolean saltWater;

    public Fish(String name, ArrayList<String> colours, boolean male, double weight, int age, String type, int gills, int eyes, int fins, boolean saltWater)
    {
        super(name, colours, male, weight, age, type);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
        this.saltWater = saltWater;
    }
    public void swim(int speed)
    {
        moveMuscles();
        moveBackFins();
        super.move(speed);
    }

    private void moveBackFins()
    {

    }

    private void moveMuscles()
    {

    }

    private void rest()
    {
        System.out.println("Fish.rest called");
    }
}
