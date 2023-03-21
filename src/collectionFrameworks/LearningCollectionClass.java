package collectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearningCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(25);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(29);
        list.add(76);
        list.add(75);

        System.out.println("Minimum element "+ Collections.min(list));
        System.out.println("Maximum element "+ Collections.max(list));
        System.out.println(Collections.frequency(list, 9));

//        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
