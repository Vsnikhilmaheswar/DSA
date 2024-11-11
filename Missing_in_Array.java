//You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). 
//This array represents a permutation of the integers from 1 to n with one element missing. 
//Your task is to identify and return the missing element.
//Input: arr[] = [1, 2, 3, 5]
//Output: 4
//Explanation: All the numbers from 1 to 5 are present except 4.

class Solution {
    int missingNumber(int arr[]) {
        int n = arr.length + 1; // length + 1 because one number is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        // Calculate the sum of elements in the array
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
