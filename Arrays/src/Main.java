//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //int[] numbers = {-2,1,-3,4,-1,2,1,-5,4};
        //var largestSumContigousSubArray = new LargestSumContigousSubArray();
        //System.out.println(largestSumContigousSubArray.soulution(numbers));
        int[] numbers = {1,2,3,4,5,6,7};
        int k = 3;
        var rotateArrayByKSteps = new RotateArrayByKSteps();
        int[] result = rotateArrayByKSteps.solution(numbers, k);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }


    }
}