package org.example.Carchallange;

public class RobinReliant extends Car
{
    private int roadServiceMonths;

    public RobinReliant(int roadServiceMonths)
    {
        super("Robin Reliant", "Small",3,
                3,5,true);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate)
    {
        int newSpeed = this.getCurrentSpeed() + rate;
    }
}
