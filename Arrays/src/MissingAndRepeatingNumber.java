import java.util.Arrays;

public class MissingAndRepeatingNumber {

    public void solution(int[] numbers, int count) {
        boolean[] visited = new boolean[numbers.length+1];
        Arrays.fill(visited,false);
        int missing = -1;
        int repeating = -1;

        for(int i = 0; i < numbers.length; i++){
            if(visited[i]){
                repeating = numbers[i];
            }
            else {
                visited[numbers[i]] = true;
            }
        }
        for(int i = 1; i <= numbers.length; i++){
            if(!visited[i]){
                missing = i;
                break;
            }
        }

        System.out.println(repeating);
        System.out.println(missing);

    }
}
