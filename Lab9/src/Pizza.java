public class Pizza {
    private String name;
    private String composition;
    private int cost;
    private Circle basis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public Pizza(String name, String composition, int cost, Circle basis) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        new Circle(5);
        this.basis = basis;
    }
}
