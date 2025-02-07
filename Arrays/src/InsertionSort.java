public class InsertionSort {
    public void insertionSort(int[] numbers){
       // [8, 4,2,8,0,10,19,4,6,2,4,0]
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j > 0; j--){
                if(numbers[j] <  numbers[j-1]){
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
