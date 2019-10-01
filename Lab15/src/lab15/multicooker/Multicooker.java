package lab15.multicooker;

import lab15.AbstractDevice;

public abstract class Multicooker extends AbstractDevice {
    @Override
    public void powerOn() {
        System.out.println("multicooker plugged in");
    }

    @Override
    public void powerOff() {
        System.out.println("multicooker has finished and plugged out");
    }

    public abstract void cook();
}
