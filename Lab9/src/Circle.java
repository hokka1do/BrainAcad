/**
 * Pattern for circle with constant radius from the beginning
 */
public class Circle {
    /**
     * Constant field with radius
     */
    private static int radius = 20;
    private static String color;

    /**
     * Calculating circle length with incoming radius
     * @param radius
     * @return result for calculated circle length
     */
    static double circleLength(int radius) {
        double result = 2 * radius * Math.PI;
        return result;
    }

    /**
     * Calculating circle square with incoming radius
     * @param radius
     * @return result for calculated circle square
     */
    static double circleSquare(int radius) {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    /**
     * Default constructors
     */
    Circle(int radius) {
        this.radius = radius;
    }


    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    /**
     * Calculating diameter with incoming radius
     * @param radius
     * @return Calculated diameter
     */
    public int diameter(int radius) {
        int diameter = radius * radius;
        return diameter;
    }

}
