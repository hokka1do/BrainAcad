public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        PostOffice postOffice = new PostOffice();
        ShopClient shopClient = new ShopClient();
        book.setBookName();
        postOffice.setOfficeNumber("69076");
        shopClient.setNumberOfCustomer(64);
        System.out.println("Name of the class: " + book.getClass().getSimpleName());
        System.out.println("bookName = " + book.getBookName());
        shopClient.addItemToCart("Black dildo");
        shopClient.addItemToCart("pocket pussy");
        shopClient.getNumberOfCustomer();
        shopClient.setNumberOfCustomer(5);
        PostOffice.getPackageVolume(5,4,3);

    }
}