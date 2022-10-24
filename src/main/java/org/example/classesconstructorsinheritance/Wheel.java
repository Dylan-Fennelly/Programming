package org.example.classesconstructorsinheritance;

public class Wheel
{
    private int radius;
    private int width;
    private String manufacturer;
    private boolean steelOrAlloy;
    private Tyre tyre;

    @Override
    public String toString()
    {
        return "Wheel{" +
                "radius=" + radius +
                ", width=" + width +
                ", manufacturer='" + manufacturer + '\'' +
                ", steelOrAlloy=" + steelOrAlloy +
                ", tyre=" + tyre +
                '}';
    }
}
