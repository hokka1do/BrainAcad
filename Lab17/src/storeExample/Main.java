package storeExample;


import storeExample.store.ROLE;
import storeExample.store.Store;
import storeExample.store.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Admin", 3410, ROLE.ADMINISTRATOR);
        User user2 = new User("Manager", 3010, ROLE.MANAGER);
        User user3 = new User("Dir", 341510, ROLE.DIRECTOR);
        User user4 = new User("ClientNo1", 1111, ROLE.CLIENT);
        User user5 = new User("ClientNo2", 1112, ROLE.CLIENT);
        Store store = new Store("Aushan", "https://auchan.ua", new User[]{user1, user2, user3, user4, user5});
        while (true) {
            tryLogin(store);
        }
    }

    /**
     * Method which creating authorization of users and asking for login and password to enter storeExample database.
     * @param store,login,password
     */
    public static void tryLogin(Store store) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("«Введите логин:»");
        String loginAuthorization = scanner.nextLine();
        System.out.println("«Введите пароль:»");
        int passwordAuthorization = scanner.nextInt();
        if (store.login(loginAuthorization, passwordAuthorization)) {
            store.getCurrentUserRights();
            store.logout();
        } else System.out.println("«Неверный логин и\\или пароль»");
    }
}
