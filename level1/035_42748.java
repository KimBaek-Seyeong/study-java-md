import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answers = new ArrayList<>();
        
        for(int[] c : commands){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int k = c[0] -1; k <c[1]; k++){
                arr.add(array[k]);
            }
            Collections.sort(arr);
            answers.add(arr.get(c[2] -1));
        }
        
        int[] answer = new int[answers.size()];
        for(int i=0; i<answers.size(); i++){
            answer[i] = answers.get(i);
        }
        
        return answer;
    }
}
