class Solution {
    public static void rearrange(int arr[]) {
        // code here
        int n = arr.length;
        int i=0;
        Arrays.sort(arr);
         int start =0;
        int end = n-1;
        int minmax_Arr [] = new int[n];
          
        while(i<n){
            if(i%2==0){
               minmax_Arr [i] = arr[end--]; 
            }
            else{
                   minmax_Arr [i] = arr[start++]; 
            }
            i++;
        }
        
        for(int k=0;k<minmax_Arr.length;k++){
             arr[k]= minmax_Arr[k];
        }
        
    }
}
