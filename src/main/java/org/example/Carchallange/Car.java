package org.example.Carchallange;

public class Car extends Vehicle
{
private int wheel;
private int doors;
private int gears;
private boolean isManual;
private int currentGear;

    public Car(String name, String size, int wheel, int doors, int gears, boolean isManual)
    {
        super(name, size);
        this.wheel = wheel;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 0;
    }
    public void changeGear(int currentGear)
    {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear+ " gear");

    }
    public void changeVelocity(int speed,int direction)
    {
        System.out.println("Car.changeVelocity: Velocity "+ speed + " direction "+direction);
        //super.move(speed,direction);
    }

    public int getWheel()
    {
        return wheel;
    }

    public int getDoors()
    {
        return doors;
    }

    public int getGears()
    {
        return gears;
    }

    public boolean isManual()
    {
        return isManual;
    }

    public int getCurrentGear()
    {
        return currentGear;
    }
}
