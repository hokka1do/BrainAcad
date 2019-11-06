package javaIOStreams;

import java.io.File;

public class DirectoryFilesPrinter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\АСФА\\IdeaProjects\\BrainAcad");
    }

    public void printName(File file) {
        try {
            if (!file.isDirectory() && !file.isFile()) {

            }
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println(f.getName());
            }
        } catch (NullPointerException e) {
            System.out.println("«Каталог не существует или пуст»");
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
 * •*Вывести рекурсивно списоквсех файлов из вложенныхпапок. Определить является ли текущий экземпляр класса File каталогом, можно с помощью метода isDirectory().
 */