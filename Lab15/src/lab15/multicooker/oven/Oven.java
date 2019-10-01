package lab15.multicooker.oven;

import lab15.multicooker.Multicooker;

public class Oven extends Multicooker {
    public Oven(int i) {
        System.out.println("Please set oven timer to cook");
        initTimer(i);
        cook();
    }

    void initTimer(int i) {
        System.out.println("Oven timer is set to " + i);
    }

    @Override
    public void cook() {
        System.out.println("Oven strats to cook...");
    }
}
