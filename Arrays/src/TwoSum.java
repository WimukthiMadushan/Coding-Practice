public class TwoSum {
    public void solutoion(int[] numbers, int target) {
        //[2,7,11,5] --> 9
        for(int i = 0; i < numbers.length; i++){
            String elementsArray = String.valueOf(i);
            int sum = numbers[i];
          for(int j = i+1; j < numbers.length; j++){
              if(sum + numbers[j] < target){
                    elementsArray = elementsArray + j;
              } else if (sum + numbers[j] == target) {
                  System.out.println(elementsArray);
                  break;
              }
              else {
                break;
              }
          }
        }
    }
}
