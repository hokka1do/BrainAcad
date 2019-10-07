public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(array, 4, 5);
        printArray(array, 1, 7);
        printArray(array,8,15);
    }

    public static void printArray(int[] array, int start, int end) {
        try {
            for (int i = start; i < end; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка.Попытка обращения к несуществующему индексу:текущий индекс =" + start + "; размер массива = " + array.length);
        }

    }
}
