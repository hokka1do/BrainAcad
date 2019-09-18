import Shop.Human.Customer.Customer;
import Shop.Shop;

public class TestMain {
    public static void main(String[] args) {
        Shop newShop = new Shop();
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
