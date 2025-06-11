// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
       Arrays.sort(a);
        Arrays.sort(b);
        long sum1 = 0;
        long sum2 = 0;
        for(int i=0;i<a.length;i++){
            sum1 += a[i];
        }
        for(int j=0;j<b.length;j++){
            sum2 += b[j];
        }
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            long temp1 = sum1 - a[i] + b[j];
            long temp2 = sum2 - b[j] + a[i];
            if(temp1 == temp2){
                return true;
            }
            else if(temp1 > temp2){
                i++;
            }
            else{
                j++;
            }
        }
        return false;
    }
}

