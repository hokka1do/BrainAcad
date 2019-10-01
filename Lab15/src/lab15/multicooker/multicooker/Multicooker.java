package lab15.multicooker.multicooker;

public class Multicooker extends lab15.multicooker.Multicooker {

    public Multicooker(int i) {
        System.out.println("Select program from 1 to 9");
        switchProgram(i);
        cook();
        powerOff();
    }

    void switchProgram(int i) {
        System.out.println("Multicooker switched program to " + i);
    }

    @Override
    public void powerOn() {
        super.powerOn();
    }

    @Override
    public void powerOff() {
        super.powerOff();
    }

    @Override
    public void cook() {
        System.out.println("Multicooker starts cooking");
    }
}
