package org.example.classesconstructorsinheritance;

public class Engine
{
    private String manufacturer;
    private String fuelType;
    private int horsePower;
    private double litres;

    @Override
    public String toString()
    {
        return "Engine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", horsePower=" + horsePower +
                ", litres=" + litres +
                '}';
    }
}
