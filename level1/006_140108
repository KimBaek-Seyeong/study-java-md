class Solution {
    public int solution(String s) {
        int answer = 0;
        char start = ' ';
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (start == ' ') {
              start = s.charAt(i);
            }
            if (start == s.charAt(i)) {
              cnt1++;
            } else {
              cnt2++;
            }
            if (cnt1 == cnt2) {
                answer++;
                cnt1 = 0;
                cnt2 = 0;
                start = ' ';
            }
        }
        if (start != ' ') {
          answer++;
        }

        return answer;
    }
}
