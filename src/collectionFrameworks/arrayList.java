package collectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class arrayList {
    public static void main(String[] args) {
//        ArrayList<String> studentsName = new ArrayList<>();
//        studentsName.add("Abhishek");
//        System.out.println(studentsName);
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);
//
//        list.add(5);  //Adds 5 at the end of the list.
//        System.out.println(list);
//
//        list.add(3,25);//Adds 25 at the index 3 and shifts the next elements by 1.
//        System.out.println(list);
//
//        List<Integer> newList = new ArrayList<>();
//        newList.add(150);
//        newList.add(250);
//
//        list.addAll(newList); //Adds all the elements of newList in the list.
//        System.out.println(list);
//
//        System.out.println(list.get(2));//
//        System.out.println(list);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

//        list.remove(1);//Renmove the element at index 1.
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(40));//Remove the element having value 40 of type integer..
//        System.out.println(list);
//
//        list.clear();//Clears all the elements from list.
//        System.out.println(list);

//        list.set(3,500);//sets the value at index 3 as 500.
//        System.out.println(list);
//
//
//        System.out.println(list.contains(250));


        for(int i=0; i<list.size();i++){
            System.out.println("the element is:"+list.get(i));
        }

        for(Integer element: list){
            System.out.println("foreach element is:"+element);
        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println("Iterator "+ it.next());
        }
    }
}
