package hw05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        MyArrayList<Integer> list2 = new MyArrayList<>();

        list.add(0, 0);
        list.add(1,10);
        list.add(2, 20);
        list.add(3, 30);
        list.add(4, 40);
        list.add(3, 100);

        list2.add(0, 00);
//        list2.add(1,10);
//        list2.add(2, 20);
//        list2.add(3, 30);
//        list2.add(4, 40);
//        list2.add(3, 100);

        System.out.println("LIST IS " + list);
//        System.out.println(list.size());
        System.out.println("LIST 2 IS " + list2);
//        System.out.println(list2.size());
    }
}
