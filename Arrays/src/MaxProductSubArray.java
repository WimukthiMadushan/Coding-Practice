public class MaxProductSubArray {
    public void solution(int[] numbers){
        // [2,3,-2,4]
        int maxProduct = 0;
        for(int i = 0; i <numbers.length; i++){
            int product = numbers[i]; //  6
            for(int j = i+1; j< numbers.length;j++){
                if(product < numbers[j]*product){  // 2 < 6
                    product = numbers[j]*product; // 6
                    maxProduct = product; // 6
                }
                else {
                    break;
                }
            }
        }
        System.out.println(maxProduct);

    }
}
