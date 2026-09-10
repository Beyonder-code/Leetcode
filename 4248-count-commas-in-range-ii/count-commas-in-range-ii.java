class Solution {
    public long countCommas(long n) {
        long ans =0L;
        if (n<1000) return 0;
        else if (n<=999999 && n>=999) ans = n-999;
        else if(n<=999999999 && n>=999999) {
            ans=n-999;
            ans+=n-999999;
        }
        else if(n<=999999999999L && n>=999999999){
            ans=n-999;
            ans+=n-999999;
            ans+=n-999999999L;
        }
        else {
            ans+=n-999;
            ans+=n-999999;
            ans+=n-999999999;
            ans+=n-999999999999L;
        }
        if(n==1000000000000000L) ans++;
        return ans;

    }
}