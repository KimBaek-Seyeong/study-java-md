class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        //이용료(totalPrice) : price*count
        long totalPrice = 0;
        for(int i=0; i<count; i++){
            totalPrice += price*(i+1);
        }
        
        if(totalPrice < money){
            answer = 0;
        } else{
            answer = totalPrice - money;
        }
        
        return answer;
    }
}
