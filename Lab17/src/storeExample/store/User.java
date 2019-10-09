package storeExample.store;

/**
 * User class has constructor, login password name and default role = set anonymous.
 */
public class User {
    String login;
    int password;
    String name;
    ROLE role = ROLE.ANONIMOUS;

    /**
     * Role getter
     *
     * @return role
     */
    public ROLE getRole() {
        return role;
    }

    /**
     * Method to set Role
     *
     * @param role
     */
    public void setRole(ROLE role) {
        this.role = role;
    }

    /**
     * Default constructor
     *
     * @param login
     * @param password
     * @param role
     */
    public User(String login, int password, ROLE role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    /**
     * Method to get login
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     * Method to set login
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Method to get password
     *
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * Method to set password
     *
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * Method to get user name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set user name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
