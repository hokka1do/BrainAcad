package Shop.Human.Employee.Manager;

import Shop.Human.Customer.Customer;
import Shop.Human.Employee.Employee;

import java.util.Objects;

public class Manager extends Employee {
    private String theDepartment;

    public Manager(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public static void consulting() {
        System.out.println("Manager consulting customers...");
    }

    public static void sayAboutDiscounts() {
        System.out.println("Manager telling about shop discounts...");
    }

    public static void giveAnAdvice() {
        System.out.println("Manager giving advice...");
    }

    public static void doWork() {
        System.out.println("Manager starts working...");
        consulting();
        sayAboutDiscounts();
        giveAnAdvice();
        Customer.buy();
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
        return "Manager{" +
                "theDepartment='" + theDepartment + '\'' +
                '}';
    }
}
