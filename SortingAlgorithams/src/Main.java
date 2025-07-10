//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {3,2,6,1,90,34,65,10,0,90,40,0,12,23,32,11,0,1,2,5,20};
        //var bubbleSort = new BubbleSort();
        //bubbleSort.sort(numbers);
        //bubbleSort.improvedSort(numbers);

        var insertionSort = new InsertionSort();
        insertionSort.sort(numbers);
    }
}