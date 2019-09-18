package Shop.Human.Customer;

import Shop.Human.Employee.Cashier.Cashier;
import Shop.Human.Employee.Manager.Manager;
import Shop.Human.Employee.Security.Security;
import Shop.Human.Human;

import java.util.Objects;

public class Customer extends Human {
    private int discount;
    private int balanceOfMoney;

    public Customer(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public static void askAboutProduct() {
        System.out.println("Customer asking about product...");
        Manager.doWork();
    }

    public static void buy() {
        System.out.println("Customer buying product...");
        Cashier.doWork();
        Security.doWork();
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
        return "Customer{" +
                "discount=" + discount +
                ", balanceOfMoney=" + balanceOfMoney +
                '}';
    }
}
