public class FIndDuplicateNumber {
    public void solution(int[]  numbers){
        for(int i = 0; i < numbers.length;i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                }
            }
        }

    }
}
