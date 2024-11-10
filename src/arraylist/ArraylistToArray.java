package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistToArray {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();// Tao arraylist va them so nguyen 
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Doi arraylist thanh mot mang
        Integer[] array = numbers.toArray(new Integer[0]);

        System.out.println("Array elements:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }

}
