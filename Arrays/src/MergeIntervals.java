public class MergeIntervals {
    public int[][] removeElement(int[][] numbers, int val) {
        int[][] newArray = new int[numbers.length - 1][2];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i == val) continue;
            newArray[j++] = newArray[i];
        }
        return newArray;
    }
    public int[][] solution(int[][] intervals) {
        // {{1,3}, {2,6}, {8,10}, {15,18}}
        int[][] result = new int[intervals.length][2];
        int i = 0;
        while( i < result.length-1){
            if(intervals[i][1]  >= intervals[i+1][0]){
                result[i] = new int[]{intervals[i][0], intervals[i+1][1]};
                result = removeElement(intervals, i+1);
                i = i+2;
            }
            else{
                result[i] = intervals[i];
                i++;
            }
        }
        return result;


    }
}
