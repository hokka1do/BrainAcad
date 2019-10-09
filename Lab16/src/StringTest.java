import java.util.Scanner;

public class StringTest {
    /**
     * @param args
     * @author Kuznetsov Illia
     * @version 1.0 created on 01/10/2019
     */

    public static void main(String[] args) {
        String string = "New String";
        String string2 = new String("New string2");
        char data[] = {'t', 'h', 'i', 's', 'i', 's', 's', 't', 'r', 'i', 'n', 'g'};
        String string3 = new String(data);
        String string4 = "abc";
        String string5 = new String(string4.getBytes());
        StringBuilder stringBuilder = new StringBuilder("Stringbuilder string");
        String string6 = new String(stringBuilder);
        String string7 = "Груша,Апельсин,Яблоко,Гранат";
        String string8[] = string7.split(",");
        String maxString = string8[0];
        for (String str : string8) {
            if (str.length() > maxString.length()) {
                maxString = str.toLowerCase();
            }
        }
        System.out.println(maxString);
        String shortMaxString = maxString.substring(0, 3);
        System.out.println(shortMaxString);
        String newString = "   Я_Новая_строка    ";
        String newTrimmedString = newString.trim();
        System.out.println(newTrimmedString);
        String string9 = newTrimmedString.replace("_", " ");
        System.out.println(string9);
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Вы ввели : " + inputString);
        if (inputString.equals("Запуск")) {
            System.out.println("Запускаем процесс");
        } else if (inputString.equals("завершен")) {
            System.out.println("завершен");
        } else if (inputString.toLowerCase().equals("ошибка")) {
            System.out.println("Произошла ошибка");
        }
        StringBuilder stringBuilder1 = new StringBuilder(string + string2 + string3
                + string4 + string5 + string6
                + string7 + string9 + shortMaxString
                + newTrimmedString + newString + inputString);
        stringBuilder1.reverse();
        System.out.println(stringBuilder1.toString());
    }
}