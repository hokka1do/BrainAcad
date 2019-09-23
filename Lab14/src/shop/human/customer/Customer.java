package shop.human.customer;

import shop.human.employee.cashier.Cashier;
import shop.human.employee.manager.Manager;
import shop.human.employee.security.Security;
import shop.human.Human;

import java.util.Objects;

public class Customer extends Human {
    private int discount;
    private int balanceOfMoney;

    public Customer(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public void askAboutProduct(Manager manager, Customer customer) {
        System.out.println("customer asking about product...");
        manager.work(customer);
    }

    public void buy(Cashier cashier, Security security) {
        System.out.println("customer buying product...");
        cashier.doWork();
        security.doWork();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return discount == customer.discount &&
                balanceOfMoney == customer.balanceOfMoney;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discount, balanceOfMoney);
    }

    @Override
    public String toString() {
        return "customer{" +
                "discount=" + discount +
                ", balanceOfMoney=" + balanceOfMoney +
                '}';
    }
}
