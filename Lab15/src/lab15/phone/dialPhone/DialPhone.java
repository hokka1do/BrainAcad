package lab15.phone.dialPhone;

import lab15.phone.Phone;

public class DialPhone  extends Phone {
    String hasAnswerPhone;

    public DialPhone(String hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
        call();
        powerOff();
    }

    @Override
    public void call() {
        System.out.println("Dial phone is calling to...");
    }

    @Override
    public void powerOn() {
        System.out.println("Dial phone is plugged in and switched on now");
    }

    @Override
    public void powerOff() {
        System.out.println("Dial phone is OFF");
    }

    void autoAnswer(){
        System.out.println("Dial phone is auto answering...");
    }
}
