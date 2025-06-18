// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        double ans = 0;
        if(choice ==1){
            double R = arr.get(0);
            return Math.PI * R * R;
           
        }
       else if(choice == 2){
           double L = arr.get(0);
            double B = arr.get(1);
            return L * B;
        }
        else{
            return 0.0;       
            }
        
    }
}