package org.example.Computer;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int RAMSlots;
    private int cardSlots;
    private String bios;
    private boolean SSDCompatible;

    public Motherboard(String model, String manufacturer, int RAMSlots, int cardSlots, String bios, boolean SSDCompatible) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.RAMSlots = RAMSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
        this.SSDCompatible = SSDCompatible;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRAMSlots() {
        return RAMSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public boolean isSSDCompatible() {
        return SSDCompatible;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program " + programName + " is now loading");
    }
}
