/**
 * Pattern of Pizza, has methods for base specification for pizza,including setters and getters to create a pizza
 */
public class Pizza {
    /**
     * Basic fields for pizza specification
     */
    private String name;
    private String composition;
    private int cost;
    private Circle basis;

    /**
     * Method to get pizza name
     *
     * @return name
     */
    String getName() {
        return name;
    }

    /**
     * Method to set pizza name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get what is the pizza consistent of
     * @return composition parameters
     */
    String getComposition() {
        return composition;
    }

    /**
     * Method to set pizza composition
     *
     * @param composition
     */
    public void setComposition(String composition) {
        this.composition = composition;
    }

    /**
     * Method to get pizza cost
     *
     * @return cost for pizza
     */
    int getCost() {
        return cost;
    }

    /**
     * Method to set pizza cost
     *
     * @param cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Method to get pizza basis from Circle class
     *
     * @return Circle basis for pizza class
     */
    Circle getBasis() {
        return basis;
    }

    /**
     * Method to set pizza composition
     *
     * @param basis
     */
    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    /**
     * Basic constructor which including all mentioned fields with parameters for pizza
     */
    Pizza(String name, String composition, int cost, Circle basis) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        new Circle(5);
        this.basis = basis;
    }
}
