import java.util.List;

public class ShopClient {
    private static final int DISCOUNT = 10;
    private int numberOfCustomer;
    private List<String> cartList;

    int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public void addItemToCart(String a) {
        cartList.add(a);
        System.out.println(a + " - was added to cart");
    }

    public static int getDiscount() {
        System.out.println("Returning number of Discount" + DISCOUNT);
        return DISCOUNT;
    }

    public static void buyItemsFromCart(List<String> cartList) {
        for (String i : cartList) {
            System.out.println(i);
        }
    }
}