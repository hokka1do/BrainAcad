package serialized;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("creditCards.ser"))) {
            CreditCard creditCard_2 = (CreditCard) objectInputStream.readObject();
            System.out.printf("CARD_TYPE : %s \t Name of the bank: %s \n, Card Number is : %d \n ", creditCard_2.getCard_type().toString(), creditCard_2.getBankName(), creditCard_2.getCardNumber());
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
/*
2.Десериализация из файла
•Создать класс DeserializeTest с методом main
•Создать блок try-with-resource
•СоздатьObjectInputStream
•Проинициализировать ObjectInputStream с параметром FileInputStream
•в FileInputStream передать File для чтения сериализованного объекта.
•File также создать с передачей в параметре имени ранее сохраненного файла•
С помощью метода readObject у объекта ObjectInputStream считать экземпляр класса CreditCard в поток.
•Привести считанный объект к классу CreditCard
•Вывести данные о кредитнойкарте на экран
    public CreditCard(CARD_TYPE card_type_default, String bankName, long cardNumber, int expDate, int cvvCode) {
        this.card_type = card_type_default;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvvCode = cvvCode;
    }
*/