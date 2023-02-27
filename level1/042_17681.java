class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            String s = Integer.toBinaryString(arr1[i] | arr2[i]); //둘 다 벽(1)이면 1 set
            s = String.format("%"+n+"s", s); //n자리 문자열로 format
            s = s.replaceAll("1", "#");
            s = s.replaceAll("0", " ");
            answer[i] = s;
        }
        
        return answer;
    }
}
