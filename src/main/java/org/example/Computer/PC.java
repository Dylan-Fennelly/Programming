package org.example.Computer;

import javax.management.monitor.Monitor;

public class PC
{
    private Case pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case pcCase, org.example.Computer.Monitor pcMonitor, Motherboard pcMotherboard)
    {
    }

    public Case getPcCase()
    {
        return pcCase;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Motherboard getMotherboard()
    {
        return motherboard;
    }

    public void powerUp()
    {
        this.pcCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        this.monitor.drawPixelAt();
    }
}
