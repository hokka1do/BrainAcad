package wrappers;

public class WrapperTest {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(20);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("30");
        Boolean b1 = true;
        Boolean b2 = new Boolean(false);
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.parseBoolean("false");
        Character c1 = 'c';
        Character c2 = new Character('s');
        Character c3 = Character.valueOf('s');
        Byte aByte = 11;
        Byte aByte2 = Byte.parseByte("18");
        Byte aByte3 = Byte.valueOf((byte) 8);
        Byte aByte4 = new Byte((byte) -5);
        Float f1 = new Float(4.5f);
        Float f2 = Float.parseFloat("4.5");
        Float f3 = Float.valueOf(15.6f);
        Float f4 = 15.5f;
        Double d1 = 1.2;
        Double d2 = new Double(5.6);
        Double d3 = Double.parseDouble("18.6");
        Double d4 = Double.valueOf(11.2);
        byte e1 = d1.byteValue();
        short s1 = d1.shortValue();
        int i5 = d1.intValue();
        long l1 = d1.longValue();
        float f5 = d1.floatValue();
        Double zero = 0.0;
        Double nanValue = zero / zero;
        Double infinityValue = d1 / zero;
        System.out.println(nanValue + " " + infinityValue);
        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = " + nanValue);
        }
        if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue  = " + infinityValue);
        }
        Long long1 = Long.valueOf(120);
        Long long2 = Long.valueOf(120);
        System.out.println(long1 == long2);
        Long long3 = Long.valueOf(1200);
        Long long4 = Long.valueOf(1200);
        System.out.println(long3 == long4);
    }
}