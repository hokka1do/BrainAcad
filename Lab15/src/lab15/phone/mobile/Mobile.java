package lab15.phone.mobile;

import lab15.phone.Phone;

public class Mobile extends Phone {
    int simCount;
    String display;

    public Mobile(int simCount, String display) {
        this.simCount = simCount;
        this.display = display;
        //powerOn();
        call();
        powerOff();
    }

    @Override
    public void call() {
        System.out.println("Mobile phone is calling to number...");
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone is switched ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Mobile phone is switched OFF");
    }
}
