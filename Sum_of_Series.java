//Write a program to find the sum of the given series 1+2+3+ . . . . . . (n terms) 
class Solution {

    public static long seriesSum(int n) {
         long sum=0 ;
        for(int i=0;i<=n;i++)
        {
           
            sum=sum+i;
        }
        return sum;
    }
   
}
