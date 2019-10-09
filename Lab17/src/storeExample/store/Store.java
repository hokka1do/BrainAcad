package storeExample.store;

public class Store {
    /**
     * Class storeExample.store.Store which getting Name of storeExample, URL, users of  storeExample and
     */
    String storeName;
    String storeUrl;
    User[] storeUsers;
    User authorizedStoreUser;

    /**
     * Constructor for new store include:
     * @param storeName - name of the store
     * @param storeUrl - store URL
     * @param storeUsers - array of store users
     */
    public Store(String storeName, String storeUrl, User[] storeUsers) {
        this.storeName = storeName;
        this.storeUrl = storeUrl;
        this.storeUsers = storeUsers;
    }

    /**
     * Login method searching in array for valid login and password.
     * @param login - user login
     * @param password - user password
     * @return If login and password is correct set user authorized to store database and return true, if not return false.
     */
    public boolean login(String login, int password) {
        for (User u : storeUsers) {
            if (login.equals(u.login) && password == u.password) {
                authorizedStoreUser = u;
                return true;
            }
        }
        return false;
    }

    /**
     * Method which show description for authorized user.
     */
    public void getCurrentUserRights() {
        switch (authorizedStoreUser.role) {
            case DIRECTOR:
                System.out.println("«Директор магазина, может управлять кадрами, и ценами»");
                break;
            case ADMINISTRATOR:
                System.out.println("«Администратор магазина, может добавлять товары и редактироватьих описание»");
                break;
            case MANAGER:
                System.out.println("«Менеджер магазина, может общаться с клиентами»");
                break;
            case CLIENT:
                System.out.println("«Клиент магазина, может покупать товары и пользоваться дисконтом»");
                break;
            case ANONIMOUS:
                System.out.println("«Анонимный пользователь, может покупать товары и\\или авторизоваться»");
                break;
        }
    }

    /**
     * Logout method for user of the store.
     * Set authorizedStoreUser to null if the user exit of the system.
     */
    public void logout() {
        authorizedStoreUser = null;
        System.out.println("«Пользователь вышел из системы»");
    }
}