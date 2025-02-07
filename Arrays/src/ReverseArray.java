import java.util.Arrays;

public class ReverseArray {
    public void solution(int[] numbers) {
        // [2,5,1,10,56,35,29,0]
        for(int i = 0; i < numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

}
