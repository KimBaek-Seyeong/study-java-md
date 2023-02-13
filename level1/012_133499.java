class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s : babbling) {
            //연속된 동일 발음 못함
            if(s.contains("ayaaya") ||
              s.contains("yeye") ||
              s.contains("woowoo") ||
              s.contains("mama")) {
                continue;
            }
            
            s = s.replace("aya", " ");
            s = s.replace("ye", " ");
            s = s.replace("woo", " ");
            s = s.replace("ma", " ");
            s = s.replace(" ", "");
            
            if(s.length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
