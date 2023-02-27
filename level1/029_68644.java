import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        List<Integer> tmp = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                if(tmp.size() > 0){
                    for(int k=0; k<tmp.size(); k++){
                        if(tmp.get(k) == sum){
                            break;
                        } else if(k == tmp.size()-1 && tmp.get(k) != sum){
                            tmp.add(sum);
                        }
                    }    
                } else{
                    tmp.add(sum);
                }
            }
        }
        
        if(tmp.size() > 0){
            answer = new int[tmp.size()];
            for(int i=0; i<tmp.size(); i++){
                answer[i] = tmp.get(i);
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
