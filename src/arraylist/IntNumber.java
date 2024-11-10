package arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class IntNumber {

    public static void main(String[] args) {
       // ArrayList<Integer> numbers = new ArrayList<>();
        //ArrayList<Inte...er> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        numbers.remove(Integer.valueOf(5));
        System.out.println("ArrayList after remove 5 number is : " + Arrays.toString(numbers.toArray()));

    }

}
