package Shop.Human.Employee.Cashier;

import Shop.Human.Employee.Employee;

import java.util.Objects;

public class Cashier extends Employee {
    private int numberOfCashDesk;

    public Cashier(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    private static void countMoney(int money) {
        System.out.println("Cashier counted money and total value of money is - " + money);
    }

    public static void doWork() {
        System.out.println("Cashier starts working...");
        countMoney(18500);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cashier cashier = (Cashier) o;
        return numberOfCashDesk == cashier.numberOfCashDesk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfCashDesk);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "numberOfCashDesk=" + numberOfCashDesk +
                '}';
    }
}
