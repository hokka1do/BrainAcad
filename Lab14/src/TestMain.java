import shop.human.customer.Customer;
import shop.Shop;
import shop.human.employee.Employee;

public class TestMain {
    public static void main(String[] args) {
        Shop newShop = new Shop();
        Customer customer = new Customer("Illia Kuznetsov","38097");
        Employee employee = new Employee("Ali","380");
        //1)
        System.out.println("Case no1 ---->");
        newShop.open();
        System.out.println();
        //2)
        System.out.println("Case no2 ---->");
        newShop.saleProducts();
        Customer.askAboutProduct();
        System.out.println();
        //3
        System.out.println("Case no3 ---->");
        newShop.goForLunch();
    }
}
