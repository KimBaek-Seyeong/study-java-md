class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int count = 0;
        for(int i : lottos){
            if (i == 0){
                count++;
            }
        }
        
        int count2 = 0;
        for (int i: lottos){
            for(int j : win_nums){
                if (j == i){
                    count2++;
                }
            }
        }
        
        //최고 : count2 + count
        //최저 : count2
        int highScore = checkScore(count2+count);
        int lowScore = checkScore(count2);
        
        answer[0] = highScore;
        answer[1] = lowScore;
        
        return answer;
    }
    
    private int checkScore(int num){
        if(num == 6){
            return 1;
        } else if(num == 5){
            return 2;
        } else if(num == 4){
            return 3;
        } else if(num == 3){
            return 4;
        } else if(num == 2){
            return 5;
        }
        
        return 6;
    }
}
