package shop.human;

import java.util.Date;
import java.util.Objects;

public class Human {
    private String name;
    private Date dateOfBirth;
    private String phoneNumber;

    public Human(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void sayHello() {
        System.out.println("human says Hello!");
    }

    void sayBye() {
        System.out.println("human says Good bye!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(dateOfBirth, human.dateOfBirth) &&
                Objects.equals(phoneNumber, human.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, phoneNumber);
    }

    @Override
    public String toString() {
        return "shop.human{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
