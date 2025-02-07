import java.util.Arrays;

public class ZeroCorner {
    public void leftCorner(int[] numbers){
        // [1,2,0,9,10,0,4,3,0,0,0,21,45,32,1,90]
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                int temp = numbers[count];
                numbers[count] = numbers[i];
                numbers[i] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
    public void leftCornerWithSameManner(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                for(int j = i; j > 0; j--){
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
    public void rightCorner(int[] numbers){
        // [1,2,0,9,10,0,4,3,0,0,0,21,45,32,1,90]
        int lastCount = numbers.length-1;
        for(int i = numbers.length-1; i >= 0; i--){
            if(numbers[i] == 0){
                int temp = numbers[lastCount];
                numbers[lastCount] = numbers[i];
                numbers[i] = temp;
                lastCount--;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
    public void rightCornerWithSameManner(int[] numbers){
        // [1,2,0,9,10,0,4,3,0,0,0,21,45,32,1,90]
        for(int i = numbers.length-1; i>= 0; i--){
            if(numbers[i] == 0){
                for(int j = i; j < numbers.length-1; j++){
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }

}
