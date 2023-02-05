class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        //ASCII a: 97, z:122 (26)
        char[] sArr = s.toCharArray();
        for(int i=0; i<sArr.length; i++) {
            for(int j=0; j<index; j++) {
                do {
                    sArr[i]++;
                    if(sArr[i] > 'z') {
                        sArr[i] -= 26;
                    }
                } while (skip.contains(String.valueOf(sArr[i])));
            }
        }
        
        answer = String.valueOf(sArr);
        return answer;
    }
}
