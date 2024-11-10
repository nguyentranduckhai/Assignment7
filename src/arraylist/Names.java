package arraylist;

import java.util.Arrays;
import java.util.ArrayList;

public class Names {
    
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Huy1");
        names.add("Huy2");
        names.add("Huy3");
//        System.out.println(names.get(0));
//        //remove by object and return Boolean type
//        System.out.println(names.remove("Huy2"));
//        // remove by index
//        System.out.println(names.remove(1));
//        System.out.println(Arrays.toString(names.toArray()));//chuyen mang dong. ve mang tinh~
//        //chuyen tu arraylist sang array, neu in ra thi in ket qua trong []
        System.out.println("names[] = " + Arrays.toString(names.toArray()));
        System.out.println("name[0] = " + names.get(0));
        System.out.println(names.remove("Huy2"));// xoa bang object

        //xóa bằng index
        System.out.println(names.remove(1));
        System.out.println("names [] = " + Arrays.toString(names.toArray()));
        
    }
    
}
