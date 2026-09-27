class Solution {
    public int maxProduct(int n) {
        int second = 0; 
        int  max =0;
       
        while ( n > 0 ){
            int temp = n % 10;
             n /= 10;
            
            if (temp > max){
                second = max;
                max = temp;
            } 
            else if (temp > second){
                second = temp;
            }
        }
      return max * second;
    }
}