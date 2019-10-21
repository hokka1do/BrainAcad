package collections;

import java.util.*;

public class Collection_s {
    public static void main(String[] args) {
        //ArrayList
        List<String> list1 = new ArrayList<>();
        String[] arrray = new String[]{"a", "b", "c", "d"};
        List<String> list2 = new ArrayList<>(list1);
        List<String> list3 = Arrays.asList(arrray);
        list2.addAll(list2.size() / 2, list3);
        Collections.reverse(list3);
        Iterator<String> iterator = list3.iterator();
        //for (int i = 0; i % 2 == 0; i++) {        }
        //Set
        Set<String> set1 = new HashSet<>();
        set1.add("abc");
        set1.add("abcd");
        set1.add("abcdef");
        set1.addAll(list1);
        set1.addAll(list2);
        for (String a : set1) {
            System.out.println(a);
        }
        Set<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);
        for (String b : set2) {
            System.out.println(b);
        }
        //Map
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "JANUARY");
        map1.put(2, "FEBRUARY");
        map1.put(3, "MARCH");
        map1.put(4, "APRIL");
        map1.put(5, "MAY");
        map1.put(6, "JUNE");
        map1.put(7, "JULY");
        map1.put(8, "AUGUST");
        map1.put(9, "SEPTEMBER");
        map1.put(10, "OCTOBER");
        map1.put(11, "NOVEMBER");
        map1.put(12, "DECEMBER");
        System.out.println(map1.get(1));
        System.out.println(map1.get(12));
        map1.put(6, "Vacation");
        for (int i = 1; i <= map1.size(); i++) {
            System.out.println(map1.get(i));
        }
        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        
    }
}
