package lab15_part2;

public class DialPhone2 implements Caller {
    public DialPhone2() {
        call();
    }

    @Override
    public void call() {
        System.out.println("Dial phone is calling to...");
    }
}
