package hw04;

import java.util.Arrays;
import java.util.List;

public class MinMaxAverage {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 88, 345, 34, 34243);

        int min = array.get(0);
        int max = array.get(0);
        int sum = 0;

        for (Integer list:array) {
            if (list < min) min = list;
            if (list > max) max = list;
            sum += list;
        }

        float average = (float)sum / (float)array.size();

        System.out.println("min is " + min);
        System.out.println("max is " + max);
        System.out.println("arithmetic mean is " + average);
    }
}


