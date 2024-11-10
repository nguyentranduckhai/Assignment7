package arraylist;

import java.util.ArrayList;

public class ProgrammingLanguagages {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        // Kiem tra xem Python co trong kh
        String searchKeyword = "Python";
        if (languages.contains(searchKeyword)) {// contains kiem tra co phan tu trong ham hay kh
            System.out.println(searchKeyword + " is in the list.");
        } else {
            System.out.println(searchKeyword + " is not in the list.");
        }
    }

}
