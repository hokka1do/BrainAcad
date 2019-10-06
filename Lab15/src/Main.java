import lab15.multicooker.Multicooker;
import lab15.multicooker.oven.Oven;
import lab15.phone.dialPhone.DialPhone;
import lab15.phone.mobile.Mobile;
import lab15.phone.mobile.smartphone.SmartPhone;
import lab15_part2.DialPhone2;
import lab15_part2.Post;
import lab15_part2.SmartPhone2;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(2, "Led");
        DialPhone dialPhone = new DialPhone("Hi");
        SmartPhone smartPhone = new SmartPhone(2, "IPS", "Android");
        Multicooker multicooker = new lab15.multicooker.multicooker.Multicooker(4);
        Oven oven = new Oven(5);
        DialPhone2 dialPhone2 =new DialPhone2();
        SmartPhone2 smartPhone2 = new SmartPhone2();
        Post post = new Post();
    }
}
