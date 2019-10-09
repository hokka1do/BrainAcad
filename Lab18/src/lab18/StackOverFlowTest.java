package lab18;

/**
 * Created by Brain on 07.10.2019.
 */
public class StackOverFlowTest {
    static int count = 0;
    static void test(){
        try {
            count++;
            System.out.println(count);
            test();
        }
        catch (StackOverflowError error){
        }

    }
}
