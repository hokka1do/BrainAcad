package Shop.Human.Employee;

import Shop.Human.Human;

import java.util.Date;
import java.util.Objects;

public class Employee extends Human {
    private Date hiringDate;
    private int salary;
    private boolean presenceOnDuty;

    public Employee(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public static void comeToWork() {
        System.out.println("Employees came to work");
    }

    public static void goForLunch() {
        System.out.println("Employees goes for lunch");
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPresenceOnDuty() {
        return presenceOnDuty;
    }

    public void setPresenceOnDuty(boolean presenceOnDuty) {
        this.presenceOnDuty = presenceOnDuty;
    }

    public static void doWork() {
        System.out.println("Employees doing their jobs...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                presenceOnDuty == employee.presenceOnDuty &&
                hiringDate.equals(employee.hiringDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hiringDate, salary, presenceOnDuty);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hiringDate=" + hiringDate +
                ", salary=" + salary +
                ", presenceOnDuty=" + presenceOnDuty +
                '}';
    }
}
