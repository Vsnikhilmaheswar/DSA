/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    var rev=0;
    var num=x;
    while(x>0)
    {
      rev=rev*10+x%10;
     
      x=Math.floor(x/10);

    
    }return num===rev

    
};
