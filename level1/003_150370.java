class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];
        int year = Integer.parseInt(today.substring(0, 4));
        int month = Integer.parseInt(today.substring(5, 7));
        int day = Integer.parseInt(today.substring(8));
        int totalD = (year*12*28) + (month*28) + day;
        
        for(int i=0; i<privacies.length; i++) {
            String[] sep = privacies[i].split(" ");
            int year2 = Integer.parseInt(sep[0].substring(0, 4));
            int month2 = Integer.parseInt(sep[0].substring(5, 7));
            int day2 = Integer.parseInt(sep[0].substring(8));
            
            int tmp = 0;
            for(int j=0; j<terms.length; j++) {
                String[] sep2 = terms[j].split(" ");
                if(sep[1].equals(sep2[0])) {
                    tmp = Integer.parseInt(sep2[1]);
                    break;
                }
            }
            
            int totalD2 = (year2*12*28) + ((month2+tmp)*28) + day2 - 1;
            if(totalD > totalD2) {
                answer[i] = i+1;
            }
        }
        
        int cnt = 0;
        for(int i=0; i<answer.length; i++) {
            if(answer[i] > 0) {
                cnt++;
            }
        }
        
        int[] arr = new int[cnt];
        int idx = 0;
        for(int i=0; i<answer.length; i++) {
            if(answer[i] > 0) {
                arr[idx] = answer[i];
                idx++;
            }
        }
        
        return arr;
    }
}
