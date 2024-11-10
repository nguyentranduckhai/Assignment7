package arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ListOfCity {

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Da Nang");
        city.add("Ha Noi");
        city.add("Da Lat");
        city.add("Ho Chi Minh");
        city.add("Hai Phong");
        System.out.println("5 name of City is : " + Arrays.toString(city.toArray()));
    }

}
