package javaIOStreams;

import java.io.*;

public class FilePrinter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\e.txt")))) {
            String firstLine = reader.readLine();
            while (firstLine != null && !firstLine.isEmpty()) {
                System.out.println(firstLine);
                firstLine = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/**
 * 2.Прочитать и вывести наэкран содержимое файла
 * •Создать класс FilePrinter и метод main
 * •Создать экземпляр класса File, в качестве параметра передать путь к нужному файлу(например путь какому-то классупроекта).
 * •СоздатьBufferedReader, проинициализироаватьегоFileReader-ом в который передать созданный ранее файл.
 * •Создание BufferedReader-а обернуть в блок try-with-resource
 * •Внутри блока прочитать файл построчно и вывести строки на экран
 */
