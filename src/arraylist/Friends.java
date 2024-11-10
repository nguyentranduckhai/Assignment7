package arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Friends {

    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Khai");
        friends.add("Hieu");
        friends.add("Hung");
        friends.add("Han");
        friends.add("Khoi");
        System.out.println(Arrays.toString(friends.toArray()));
        System.out.println(friends.remove(2));
        
    }    
}
