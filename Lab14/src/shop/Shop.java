package shop;

import shop.human.customer.Customer;
import shop.human.employee.cashier.Cashier;
import shop.human.employee.Employee;
import shop.human.employee.manager.Manager;
import shop.human.employee.security.Security;

public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private Cashier cashier;
    private Security security;
    private Customer customer;

    public void open(Employee employee) {
        System.out.println("The shop is open now");
        employee.comeToWork();
    }

    public void goForLunch(Employee employee) {
        System.out.println("shop is closing for lunch...");
        employee.goForLunch();
    }

    public void saleProducts() {
        System.out.println("shop start sale products...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
