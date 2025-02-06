public class LargestSumContigousSubArray {
    public int soulution(int[] numbers) {
        //numbers = [-2,1,-3,4,-1,2,1,-5,4]
        int highest = 0;
        for(int i = 0; i < numbers.length; i++){
            int sum = numbers[i];
            for (int j = i+1; j < numbers.length; j++){
                sum += numbers[j];
                if(highest  < sum){
                    highest = sum;
                }
            }
        }
        return highest;
    }
}

//class Solution {
//    public int maxSubArray(int[] nums) {
//        // dp[i] := the maximum sum subarray ending in i
//        int[] dp = new int[nums.length];

//        dp[0] = nums[0];
//        for (int i = 1; i < nums.length; ++i)
//            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);

//        return Arrays.stream(dp).max().getAsInt();
//    }
//}
