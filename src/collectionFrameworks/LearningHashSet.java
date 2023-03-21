package collectionFrameworks;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LearningHashSet {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//
//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);
//
//        set.add(21);//Will not be added in set.
//        set.add(65);//   ''
//        set.add(225);// Added in set.
//
//        System.out.println(set);
//
//        set.remove(54);
//
//        System.out.println(set);
//
//        System.out.println(set.contains(100));   //return boolean value
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//
//        set.clear();
//
//        System.out.println(set);


        //Linked Hashset

        //Set<Integer> set = new LinkedHashSet<>();  //Here the order will be maintained.

        //TreeSet
        Set<Integer> set = new TreeSet<>();     //Sorted form and also defines the set properties.
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        set.remove(54);

        System.out.println(set);

        System.out.println(set.contains(100));   //return boolean value
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}
