package org.example.classesconstructorsinheritance;

public class Tyre
{
    private int radius;
    private int width;
    private int distanceToRim;
    private int pressure;
    private double threadDepth;
    private String type;
    private String manufacturer;

    @Override
    public String toString()
    {
        return "Tyre{" +
                "radius=" + radius +
                ", width=" + width +
                ", distanceToRim=" + distanceToRim +
                ", pressure=" + pressure +
                ", threadDepth=" + threadDepth +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
