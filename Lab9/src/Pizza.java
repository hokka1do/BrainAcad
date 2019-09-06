public class Pizza {
    private String name;
    private String composition;
    private int cost;
    private Circle basis;

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    Pizza(String name, String composition, int cost, Circle basis) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        new Circle(5);
        this.basis = basis;
    }
}
