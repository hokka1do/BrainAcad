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

    public void open() {
        System.out.println("The shop is open now");
        Employee.comeToWork();
    }

   public void goForLunch() {
        System.out.println("shop is closing for lunch...");
       Employee.goForLunch();
    }
    public void saleProducts(){
        System.out.println("shop start sale products...");
    }
}
