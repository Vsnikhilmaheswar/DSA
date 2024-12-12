var fib = function(n) {
      if(n<2)
    {
        return n;
    }
    arr = [0,1]
    for(i=1;i<=n;i++)
    {
     arr[i+1]= arr[i]+arr[i-1];
    }
    return arr[n]
};
