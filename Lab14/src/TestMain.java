import Shop.Human.Customer.Customer;
import Shop.Human.Employee.Cashier.Cashier;
import Shop.Human.Employee.Employee;
import Shop.Human.Employee.Manager.Manager;
import Shop.Human.Employee.Security.Security;
import Shop.Shop;

public class TestMain {
    public static void main(String[] args) {
        Shop newShop = new Shop();
        //1)
        System.out.println("Case no1 ---->");
        newShop.open();
        Employee.comeToWork();
        System.out.println();
        //2)
        System.out.println("Case no2 ---->");
        newShop.saleProducts();
        Customer.askAboutProduct();
        System.out.println();
        //3 Was modified "go for lunch" calling from shop method. So we just call "go for lunch" once from shop.
        System.out.println("Case no3 ---->");
        newShop.goForLunch();
    }
}
