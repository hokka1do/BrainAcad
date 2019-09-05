public class Factorial {
    static private int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            if (result <= 1000) {
                if (result % 3 == 0) {
                    System.out.println(result);
                }
            } else {
                System.out.println("Достигнут максимально возможный результат");
                break;
            }
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(10));
    }
}
