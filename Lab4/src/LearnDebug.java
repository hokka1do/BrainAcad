public class LearnDebug {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "-> чётное");
            } else {
                System.out.println(i + "-> нечётное");
            }
        }
        System.out.println(true && false || true && !false);
        System.out.println(false || false || !true && false);
        System.out.println(!false && (false || true && true));
        System.out.println(4 > 8 && !(7 == 0));
        System.out.println(!(true && false || false && true) && !(true && 4 <= 5));

        String[] workDays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] dayOffs = new String[]{"Saturday", "Sunday"};
        String saturday = "Saturday";
        for (int i = 0; i < workDays.length; i++) {
            if (workDays[i].equals(saturday)) {
                System.out.println("Это рабочий день");
            }
        }
        for (int i = 0; i < dayOffs.length; i++) {
            if (dayOffs[i].equals(saturday)) {
                System.out.println("Это выходной день");
            }
        }


    }
}
