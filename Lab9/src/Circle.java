public class Circle {
    private static int radius = 20;
    private static String color;

    static double circleLength(int radius) {
        double result = 2 * radius * Math.PI;
        return result;
    }

    static double circleSquare(int radius) {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public int diameter(int radius){
        int diameter = radius * radius;
        return diameter;
    }

}
