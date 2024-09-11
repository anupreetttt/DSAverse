package DataStructure.maps;

import java.util.HashMap;

public class hashMaps {
    public static void main(String[] args) {

//        HashMap <Integer, String> m = new HashMap<Integer, String>();
        HashMap m = new HashMap();

        m.put(101, "Anupreet");
        m.put(102, "Sam");
        m.put(103, "Avi");
        m.put(104, "Mark");
        m.put(105, "Lou");
        m.put(104, "Sam");

//        System.out.println(m);
//
//        System.out.println(m.get(103));
//        System.out.println(m.containsKey(104));
//
//        System.out.println(m.containsValue("Sam"));
//
//        System.out.println(m);
//
//        System.out.println(m.containsKey(104));
//
//        System.out.println(m.isEmpty() + " not empty");

//        System.out.println(m.keySet());
//        System.out.println(m.values());

        System.out.println(m.entrySet());

//        for (Object i :m.keySet()) {
//            System.out.println(i);
//        }
//        for (Object i :m.values()){
//            System.out.println(i);
//        }
    }
}
