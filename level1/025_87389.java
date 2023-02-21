class Solution {
    public int solution(int n) {
        int answer = n-1;
        
        for(int i=(n-2); i>0; i--){
            if(n%i == 1){
                answer = i;
            }
        }
               
        return answer;
    }
}
