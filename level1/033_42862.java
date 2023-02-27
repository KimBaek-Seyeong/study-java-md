import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == -1) break;
                
                if(reserve[j] == -1) continue;
                
                if(Math.abs(lost[i] - reserve[j]) == 1){
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}
