package serialized;

import java.io.*;

public class SerializeTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(CreditCard.CARD_TYPE.MASTERCARD, "WELLS FARGO",
                888855135, 1112, 718);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("creditCards.ser"))) {
            objectOutputStream.writeObject(creditCard);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
•Создать класс SerializeTest с методом main
•Создать в main методе экземпляр класса CreditCard
•Создать блок try-with-resource
•Создать ObjectOutputStream
•Проинициализировать ObjectOutputStream с параметром FileOutputStream
•в FileOutputStream передать File для сохранения сериализованного объекта.
•File также создать с передачей в параметре имени файла (например card.ser)
•Спомощью метода writeObject у объекта ObjectOutputStream записать экземпляр класса CreditCard в поток.
•Запустить программу и проверить, что файл создался.

 */
