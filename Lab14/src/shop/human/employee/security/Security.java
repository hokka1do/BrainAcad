package shop.human.employee.security;

import shop.human.employee.Employee;

public class Security extends Employee {
    public Security(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    void talkOnRadio() {
        System.out.println("security talking on radio");
    }

    public void doWork() {
        System.out.println("security start doing his job...");
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
