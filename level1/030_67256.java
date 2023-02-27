class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 10, r = 12;
        
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            
            if(num == 0) num = 11;
            
            switch(num%3){
                case 1 : answer += "L"; l = num; break;
                case 2 : int minusl = (num > l) ? (num - l) : (l - num);
                         int minusr = (num > r) ? (num - r) : (r - num);
                         int disl = (minusl % 3) + (minusl / 3);
                         int disr = (minusr % 3) + (minusr / 3);
                         
                         if(disl > disr){
                             answer += "R";
                             r = num;
                         } else if(disl < disr){
                             answer += "L";
                             l = num;
                         } else {
                             if(hand.equals("left")){
                                 answer += "L";
                                 l = num;
                             } else{
                                 answer += "R";
                                 r = num;
                             }
                         }
                         
                         break;
                case 0 : answer += "R"; r = num; break;
            }
        }
        
        return answer;
    }
}
