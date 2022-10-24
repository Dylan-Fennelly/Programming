package org.example.Computer;

public class Main
{
    public static void main(String[] args)
    {
        playWithPCs();
    }

    private static void playWithPCs()
    {
        Dimensions caseDimensions = new Dimensions(25, 75, 50);
        Case pcCase =  new Case("220B", "Dell", "240", caseDimensions);
        Resolution monitorResolution = new Resolution(2560, 1440);
        Monitor pcMonitor = new Monitor("27 inch mega monitor", "Acer", 27, monitorResolution, 165);
        Motherboard pcMotherboard = new Motherboard("BJ-220", "Asus", 4, 6, "v3.77", true);
        PC myPC = new PC(pcCase, pcMonitor, pcMotherboard);
        myPC.powerUp();
    }

    /* Create a single room of a house using composition.
    Think about the things that should be included in the room.
    This could be physical parts of the house as well as furniture.
    Add at least one method to access an object via a getter and
    then the object's public method.
    Then add at least one method to hide the object, e.g., not using
    a getter but access the object used in composition withing the main class
    as in the last example.
     */
}
