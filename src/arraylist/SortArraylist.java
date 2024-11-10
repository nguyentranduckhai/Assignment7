package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArraylist {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);

        // Sap xep
        sortArrayList(numbers);
        System.out.println("List after sort: " + numbers);

        // doi arraylist thanh array
        Integer[] array = convertArrayListToArray(numbers);
        System.out.println("Element of the array:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }

    // Ham sap xep 
    public static void sortArrayList(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Hoan doi cac phan tu
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    // chuyen arraylist thanh mang
    public static Integer[] convertArrayListToArray(ArrayList<Integer> list) {
        return list.toArray(new Integer[0]);
    }

}
