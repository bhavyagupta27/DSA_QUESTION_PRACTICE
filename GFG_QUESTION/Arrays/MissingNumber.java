class Solution {
    long missingNum(int arr[]) {
        // code here
        long n = arr.length+1;
        long sum = n*(n+1)/2;
        long arraySum = 0;
        for(long ele : arr){
            arraySum += ele;
        }
        return sum - arraySum;
    }
}