// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int WindowSum =0;
        for(int i=0;i<k;i++){
            WindowSum+=arr[i];
        }
       int max =  WindowSum;
        
        for(int i=k;i<arr.length;i++){
             WindowSum += arr[i] - arr[i-k];
             max = Math.max(max , WindowSum);
              
        }
        
        return max;
        
        
    }
}