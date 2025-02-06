public class RotateArrayByKSteps {
    public int[] solution(int[] numbers, int k) {
        for(int i = 0; i < k ; i++){
            int temp = numbers[numbers.length-1];
            for(int j = numbers.length-1; j > 0; j--){
               numbers[j] = numbers[j-1];
           }
            numbers[0] = temp;
        }
        return numbers;
    }
}
