import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0, n = 0, index = 0;
        int[] dart = new int[3];
        String numVal = "";
        
        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(c >= '0' && c <= '9') {
                numVal += String.valueOf(c);
            } else if(Arrays.asList('S', 'D', 'T').contains(c)) {
                n = Integer.parseInt(numVal);
                
                switch (c) {
                    case 'S' :
                        dart[index++] = (int) Math.pow(n, 1);
                        break;
                    case 'D' :
                        dart[index++] = (int) Math.pow(n, 2);
                        break;
                    case 'T' :
                        dart[index++] = (int) Math.pow(n, 3);
                        break;
                }
                
                numVal = "";
            } else {
                if(c == '*') {
                    dart[index - 1] *= 2;
                    if(index - 2 >= 0) {
                        dart[index - 2] *= 2;
                    }
                } else {
                    dart[index - 1] *= (-1);
                }
            }
        }
        
        answer = dart[0] + dart[1] + dart[2];
        return answer;
    }
}
