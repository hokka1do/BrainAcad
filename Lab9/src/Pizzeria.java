public class Pizzeria {
    /**
     * Main class for organized pizzeria
     * Creating few different type of pizzas and printing in console all types
     * @param args
     */
    public static void main(String[] args) {

        Pizza[] pizzas = new Pizza[]{
                new Pizza("Neapolitan", "Cheddar, Sausage, Broccoli", 4, new Circle(35)),
                new Pizza("Three cheeses", "Cheddar, Blue cheese, Parmesan", 6, new Circle(45)),
                new Pizza("Cossacks", "Cheddar, Blue cheese, Parmesan , Sausage , Tomatoes", 7, new Circle(40))};
        for (Pizza i : pizzas) {
            System.out.println(i.getName() + i.getComposition() + i.getCost() + i.getBasis());

        }
    }
}
