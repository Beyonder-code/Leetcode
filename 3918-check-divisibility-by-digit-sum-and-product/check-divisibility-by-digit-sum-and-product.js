/**
 * @param {number} n
 * @return {boolean}
 */

var checkDivisibility = function(n) {
    let a = n;
    let prod=1;
    let sum =0;
    while(a>0){
        let temp = Math.floor(a%10);
        sum += temp;
        prod *= temp;
        a = Math.floor(a/10);
        
    }
    prod +=sum;
    console.log(prod);
    if( n%prod==0)  return true;
    return false;
};