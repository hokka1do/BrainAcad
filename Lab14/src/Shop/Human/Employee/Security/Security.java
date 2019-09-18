package Shop.Human.Employee.Security;

import Shop.Human.Employee.Employee;

public class Security extends Employee {
    public Security(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    static void talkOnRadio() {
        System.out.println("Security talking on radio");
    }

        public static void doWork() {
        System.out.println("Security start doing his job...");
        talkOnRadio();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
