package javaIOStreams;

import java.io.File;

public class DirectoryFilesPrinter {
    public static void main(String[] args) {
        File file = new File(new File("./").getAbsolutePath());
        for (String i : file.list()) {
            System.out.println(i);
        }
        printName(file);
    }

    private static void printName(File file) {
        try {
            if (!file.exists()) {
                System.out.println("«Каталог не существует или пуст»");
            }
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println(f.getName());
            }
        } catch (NullPointerException ignored) {
        }
    }
}
/*
 * 1.Вывести на экран список файловкаталогапо адресу.
 * •Создать класс DirectoryFilesPrinter и метод main
 * •Создать экземпляр класса File, в качестве параметра передать путь к нужной папке(например путь папке проекта)
 * •Создать метод printNames который выводит названия файлов/папок
 * oЧтобы получить список, можно использовать метод listFiles()
 * Чтобы получить имя файла/папки,можно использовать метод getName()
 * oЕсли по данному адресу нет ни файлов,ни каталогов –вывести сообщение«Каталог не существует или пуст»
 * •*Вывести рекурсивно список всех файлов из вложенных папок. Определить является ли текущий экземпляр класса File каталогом, можно с помощью метода isDirectory().
 */