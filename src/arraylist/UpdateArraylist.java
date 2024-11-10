package arraylist;

import java.util.ArrayList;

public class UpdateArraylist {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Update the 3rd element (index 2) to 100
        numbers.set(2, 100);

        // Print the updated ArrayList
        System.out.println("Updated ArrayList : " + numbers);
    }

}
