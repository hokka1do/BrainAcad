package shop.human.employee.cashier;

import shop.human.employee.Employee;

import java.util.Objects;

public class Cashier extends Employee {
    private int numberOfCashDesk;

    public Cashier(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    private void countMoney(int money) {
        System.out.println("cashier counted money and total value of money is - " + money);
    }

    public void doWork() {
        System.out.println("cashier starts working...");
        countMoney(18500);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return numberOfCashDesk == cashier.numberOfCashDesk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfCashDesk);
    }

    @Override
    public String toString() {
        return "cashier{" +
                "numberOfCashDesk=" + numberOfCashDesk +
                '}';
    }
}
