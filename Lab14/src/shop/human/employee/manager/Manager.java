package shop.human.employee.manager;

import shop.human.customer.Customer;
import shop.human.employee.Employee;
import shop.human.employee.cashier.Cashier;
import shop.human.employee.security.Security;

import java.util.Objects;

public class Manager extends Employee {
    private String theDepartment;

    public Manager(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public void consulting() {
        System.out.println("manager consulting customers...");
    }

    public void sayAboutDiscounts() {
        System.out.println("manager telling about shop discounts...");
    }

    public void giveAnAdvice() {
        System.out.println("manager giving advice...");
    }

    public void work(Customer customer) {
        System.out.println("manager starts working...");
        consulting();
        sayAboutDiscounts();
        giveAnAdvice();
        Cashier cashier = new Cashier("Vas", "165");
        Security security =new Security("Dima","1313");
        customer.buy(cashier, security);
    }

    public String getTheDepartment() {
        return theDepartment;
    }

    public void setTheDepartment(String theDepartment) {
        this.theDepartment = theDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(theDepartment, manager.theDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theDepartment);
    }

    @Override
    public String toString() {
        return "manager{" +
                "theDepartment='" + theDepartment + '\'' +
                '}';
    }
}
