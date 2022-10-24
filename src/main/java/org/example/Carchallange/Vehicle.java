package org.example.Carchallange;

public class Vehicle
{
    private String name;
    private String size;

    private int currentSpeed;
    private int currentDirection;


    public Vehicle(String name, String size)
    {
        this.name = name;
        this.size = size;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }
    public void steer(int direction)
    {
        this.currentDirection +=direction;
        System.out.println("Vehicle.steer(): Streering at "+currentDirection+ "Degrees");

    }

    public String getName()
    {
        return name;
    }

    public String getSize()
    {
        return size;
    }

    public int getCurrentSpeed()
    {
        return currentSpeed;
    }

    public int getCurrentDirection()
    {
        return currentDirection;
    }
    //    public void move(int speed, int currentDirection)
//    {
//        this.currentSpeed = speed;
//        this.cur
//    }
}
