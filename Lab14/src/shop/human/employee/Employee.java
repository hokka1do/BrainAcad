package shop.human.employee;

import shop.human.Human;

import java.util.Date;

public class Employee extends Human {
    private Date hiringDate;
    private int salary;
    private boolean presenceOnDuty;

    public Employee(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public void comeToWork() {
        System.out.println("Employees came to work");
    }

    public void goForLunch() {
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

    public void doWork() {
        System.out.println("Employees doing their jobs...");
    }


}
