package javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleCopy {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C://SomeDir//Hello.txt");
             FileOutputStream fos = new FileOutputStream("C://SomeDir//Hello2.txt")) {
            int i = -1;
            while (!(fis.read() == -1)) {
                fos.write((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
/*3.Копирование файла
•Создать класс FileCopy и метод main
•В блоке try-with-resources создать FileInputStream для файла оригинала и FileOutputStream для файла копии.
•В цикле while читать все байты(метод read())пока не будет достигнуто значение -1
•Каждый прочитанный в цикле байт записывать в поток файла копии(метод write(character))
*/
