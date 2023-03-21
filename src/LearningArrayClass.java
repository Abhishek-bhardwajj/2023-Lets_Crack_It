import java.util.Arrays;

public class LearningArrayClass {
    public static void main(String[] args) {
//        int [] numbers = {1,2,3,4,6,7,8,12};
//        int index = Arrays.binarySearch(numbers,4);
//        System.out.println("the index of element 4 in the array is "+index);

        Integer[] numbers = {10, 2 , 56, 78, 32, 52, 11, 3, 23, 41};
        Arrays.sort(numbers);

        for(int i : numbers){
            System.out.print(i+' ');
        }

    }
}
