package lab18;

/**
 * Created by Brain on 07.10.2019.
 */
public class MoneyTransactionUtil {
    private MoneyTransactionUtil() {
    }

    public static void sendTo(int cardNumber, int cardNumber2, int amount) throws AcountExceptions, MoneyValueExceptions {
        if (cardNumber == cardNumber2) {
            throw new AcountExceptions();
        }
        if (amount <= 0 || amount > 100_000) {
            throw new MoneyValueExceptions();
        }
        System.out.println("Amount" + amount + "from card number" + cardNumber + " to" + cardNumber2 + " succesfully transferred");
    }
}
