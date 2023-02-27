import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> tmp = new ArrayList<Integer>();
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int cntOne = 0;
        int cntTwo = 0;
        int cntThree = 0;
        
        for(int i=0; i<answers.length; i++){
            if(one[i%5] == answers[i]){
                cntOne++;
            }
            if(two[i%8] == answers[i]){
                cntTwo++;
            }
            if(three[i%10] == answers[i]){
                cntThree++;
            }
        }
        
        int maximum = Math.max(Math.max(cntOne, cntTwo), cntThree);
        
        if(maximum == cntOne) tmp.add(1);
        if(maximum == cntTwo) tmp.add(2);
        if(maximum == cntThree) tmp.add(3);
        
        answer = new int[tmp.size()];
        for(int i=0; i<tmp.size(); i++){
            answer[i] = tmp.get(i);
        }
        
        return answer;
    }
}
