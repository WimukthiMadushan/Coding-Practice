import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] numbers){
        // [3,2,6,1,90,34,65,10,0,90,40,0,12,23,32,11,0,1,2,5,20]
        System.out.println("Before sorting: ");
        System.out.println("Sorting using Insertion Sort");

        for(int i = 0 ; i < numbers.length; i++){
            int key = numbers[i];
            for(int j = i; j > 0 ; j--){
                if (numbers[j - 1] > key) {
                    //swap
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = key;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
