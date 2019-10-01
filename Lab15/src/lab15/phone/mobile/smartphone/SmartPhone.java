package lab15.phone.mobile.smartphone;

import lab15.phone.mobile.Mobile;

public class SmartPhone extends Mobile {
    String os;

    public SmartPhone(int simCount, String display, String os) {
        super(simCount, display);
        this.os = os;
        runApp();
    }

    void runApp() {
        System.out.println("Smartphone is starting app");
    }
}
