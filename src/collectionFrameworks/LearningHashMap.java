package collectionFrameworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearningHashMap {
    public static void main(String[] args) {
//      Map<String, Integer> numbers = new HashMap<>();   // O(1) operations time complexity.

        Map<String, Integer> numbers = new TreeMap<>();   // Sorted on the basis of the key.  O(logn) Operations time complexity.
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        //numbers.put("Two", 25);  //Overriding will be there for key "Two".

        numbers.putIfAbsent("Two", 25); //If value for the key "Two" is not there then it will put otherwise not.

        numbers.remove("Three");

        System.out.println(numbers.containsValue(3));
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());


//        for(Map.Entry<String, Integer> e : numbers.entrySet()){
//            System.out.println(e);
//
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        for(String key : numbers.keySet()){
//            System.out.println(key);
//        }
//        for(Integer value : numbers.values()){
//            System.out.println(value);
  //      }
    }
}
