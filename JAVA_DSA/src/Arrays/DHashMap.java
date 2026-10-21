package Arrays;

import java.util.HashMap;

public class DHashMap {
    public static void main(String[] args) {

        HashMap<String,Integer> studentAge = new HashMap<>();
        studentAge.put("raj",18);
        studentAge.put("singh",01);
        studentAge.put("raj",2);
        boolean hasRaj = studentAge.containsKey("raj");;
        System.out.println(hasRaj);
        System.out.println("raj age:" + studentAge.get("raj"));
    }
}
