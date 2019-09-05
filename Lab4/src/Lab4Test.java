import java.util.Arrays;

public class Lab4Test {
    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray = new float[4]; //  init it's array by new with size 4.

        //insert some value to start of array and to end of array.

        int[] intArray = {2, 4, 5, 8, 65}; // init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length);
        // copy "intArray". Use copyOf...
        // 1.3)
        //  sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);
        // 1.4)
        //  print "intArrayCopy", use Arrays toString.
        System.out.println(Arrays.toString(intArrayCopy));
        // 1.5)
        //  compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        Arrays.equals(intArray, intArrayCopy);
        {
            if (intArray.equals(intArrayCopy)) {
                System.out.println("Arrays is the same");
            } else {
                System.out.println("Arrays are different");
            }
        }
        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }

        // 2.1)
        // calc sum of all array elements and print result.
        int summa = 0;

        System.out.println(summa);

        // 2.2)
        // calc sum of all numbers with odd indexes and print result.
        int odd = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] % 2 == 0) {
                odd += testArray[i];
            }
        }
        System.out.println(odd);
        // 2.3)
        //  find max value in array.
        int maxNumber = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] > maxNumber) {
                maxNumber = testArray[i];
            }
        }
        System.out.println(maxNumber);

        // PART 3

        //3.1
        //  create two-dimensional array with size [3][4]

        int[][] doubleArray = new int[3][4];

        //3.2
        //  fill array with any numbers in cycles.

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = j + 1;
            }
        }

        //3.3
        //  calc sum of all array elements and print result.
        int sumArray = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                sumArray += doubleArray[i][j];
            }
        }
        System.out.println("Общая сумма элементов массива равна: " + sumArray);

        // PART 4*
        // calc sum only max and min values of matrix by expression:  and only every third j value.
        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        long min = matrix[0][0];
        for (int i = 2; i < matrix.length; i++) {
            if (i > 2 && i <= 5) {
                for (int j = 2; j < matrix[i].length; j++) {
                    if (j % 3 == 0) {
                        if (min > matrix[i][j]) {
                            min = matrix[i][j];
                        }
                    }
                }
            }
        }
        System.out.println(min);
        long max = matrix[0][0];
        for (int i = 2; i < matrix.length; i++) {
            if (i > 2 && i <= 5) {
                for (int j = 2; j < matrix[i].length; j++) {
                    if (j % 3 == 0) {
                        if (max < matrix[i][j]) {
                            max = matrix[i][j];
                        }
                    }
                }
            }
        }
        long sum = min + max;

        System.out.println(sum);
    }
}
