package lab15_part2;

import java.io.IOException;

public class SmartPhone2 implements Caller, EmailSender {
    public SmartPhone2() {
        editEmail("Lets edit email");
        call();
    }

    @Override
    public String editEmail(String a) {
        System.out.println("SmartPhone2 editing mail");
        return a;
    }

    @Override
    public void call() {
        System.out.println("SmartPhone2 is calling");
    }
}
