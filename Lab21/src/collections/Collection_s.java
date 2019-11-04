package collections;

import java.util.*;

public class Collection_s {
    public static void main(String[] args) {

        //ArrayList

        List<String> list1 = new ArrayList<>();
        String[] arrray = new String[]{"a", "b", "c", "d", "ef", "sfd", "sffh"};
        list1.toArray(arrray);
        List<String> list2 = new ArrayList<>(list1);
        List<String> list3 = Arrays.asList(arrray);
        list2.addAll(list2.size() / 2, list3);
        Collections.reverse(list3);
        Iterator<String> iterator = list3.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                list3.remove(iterator);
                System.out.println(iterator.next());
            }
        }
        System.out.println("----------");

        //Set

        Set<String> set1 = new HashSet<>();
        set1.add("abc");
        set1.add("abcd");
        set1.add("abcdef");
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println("Printing set1 :");
        for (String a : set1) {
            System.out.println(a);
        }
        System.out.println();
        Set<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);
        System.out.println("Printing set2 :");
        for (String b : set2) {
            System.out.println(b);
        }
        System.out.println("----------");

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
        System.out.println("3c) -" + map1.get(1) + " " + map1.get(12));
        System.out.println();
        map1.put(6, "Vacation");
        System.out.println("3d) -");
        for (int i = 1; i <= map1.size(); i++) {
            System.out.println(map1.get(i));
        }
        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("3g) -");
        for (Map.Entry<Integer, String> item : map1.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        for (Map.Entry<Integer, String> item : map2.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        Map<String, Set<String>> studentMap = new LinkedHashMap<>();
        Set<String> studentNo1 = new LinkedHashSet<>();
        studentNo1.add("380975131");
        studentNo1.add("lik@sdvn.ru");
        studentNo1.add("@bra");
        studentMap.put("Vaska", studentNo1);
        System.out.println("----------");
        class User {
            private String name;
            private int old;
            private String phone;

            public User(String name, int old, String phone) {
                this.name = name;
                this.old = old;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public int getOld() {
                return old;
            }

            public String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", old=" + old +
                        ", phone='" + phone + '\'' +
                        '}';
            }
            //hashcode v.1

            public int hashCode1() {
                return Objects.hash(name);
            }

            //hashcode v.2
            @Override
            public int hashCode() {
                return Objects.hash(name, old, phone);
            }

        }
        Set<User> userSet = new HashSet<>();
        User user1 = new User("Jo", 15, "38095313413");
        User user2 = new User("Jo", 15, "38095313413");
        User user3 = new User("Jo", 10, "38095313413");
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        System.out.println("4g) - names:");
        for (User b : userSet) {
            System.out.println(b.getName());
        }
        System.out.println();
        System.out.println("4h) - hashcode for name only:");
        for (User b : userSet) {
            System.out.println(b.hashCode1());
        }
        System.out.println();
        System.out.println("4h) - full hashcode :");
        for (User b : userSet) {
            System.out.println(b.hashCode());
        }
    }
}