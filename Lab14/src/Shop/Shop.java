package Shop;

import Shop.Human.Customer.Customer;
import Shop.Human.Employee.Cashier.Cashier;
import Shop.Human.Employee.Employee;
import Shop.Human.Employee.Manager.Manager;
import Shop.Human.Employee.Security.Security;

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
        System.out.println("Shop is closing for lunch...");
       Employee.goForLunch();
        //Как вызвать "идут на обед" у всех сотрудников? сделать класс абстрактным и метод в нём и тогда по умолчанию нужно будет переопределять у сотрудников этот метод !?!?
    }
    public void saleProducts(){
        System.out.println("Shop start sale products...");
    }
}
