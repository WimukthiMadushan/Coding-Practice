import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] numbers){
        System.out.println("Before Sorting");
        System.out.println("Sorting using Bubble Sort");
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length - 1 -j; j++){
                if(numbers[j] > numbers[j+1]){
                    // Swap the elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting " + Arrays.toString(numbers));
    }
    public void improvedSort(int[] numbers){
        System.out.println("Before Sorting");
        System.out.println("Sorting using Bubble Sort");

        boolean swapped;
        for(int i = 0; i < numbers.length; i++){
            swapped = false;
            for(int j = 0; j < numbers.length - 1 - j; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("After Sorting " + Arrays.toString(numbers));
    }
}
