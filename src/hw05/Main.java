package hw05;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        MyArrayList<String> list2 = new MyArrayList<>();

//        ArrayList<Integer> list = new ArrayList<>();
//        MyArrayList<Integer> list2 = new MyArrayList<>();

        list.add(0, "a");
        list.add(1,"b");
        list.add(2, "c");
        list.add(3, "d");
        list.add(4, "e");
        list.add(5, "f");
        list.add(6, "g");
        list.add(7, "h");
        System.out.println("ORIGINAL " + list);
        list.addAll(8, new ArrayList<>(Arrays.asList("123", "456", "789")));
        System.out.println("ORIGINAL " + list);
        System.out.println("SIZE - " + list.size());

        System.out.println();

        list2.add(0, "a");
        list2.add(1,"b");
        list2.add(2, "c");
        list2.add(3, "d");
        list2.add(4, "e");
        list2.add(5, "f");
        list2.add(6, "g");
        list2.add(7, "h");
        System.out.println("MY LIST  " + list2);
        list2.addAll(8, new ArrayList<>(Arrays.asList("123", "456", "789")));
        System.out.println("MY LIST  " + list2);
        System.out.println("SIZE - " + list2.size());


//        list.add(0, 0);
//        list.add(1,1);
//        list.add(2, 2);
//        list.add(3, 3);
//        list.add(4, 4);
//        list.add(5, 5);
//        list.add(6, 6);
//        list.add(7, 7);
//        list.add(8, 8);
//        list.add(9, 9);
//        list.add(10, 10);
//        list.add(5, 1000);
//
//        list2.add(0, 0);
//        list2.add(1,1);
//        list2.add(2, 2);
//        list2.add(3, 3);
//        list2.add(4, 4);
//        list2.add(5, 5);
//        list2.add(6, 6);
//        list2.add(7, 7);
//        list2.add(8, 8);
//        list2.add(9, 9);
//        list2.add(10, 10);
//        list2.add(5, 1000);
    }
}
