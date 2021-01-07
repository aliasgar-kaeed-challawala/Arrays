class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        int maxEndingHere = 0;
        int maxSoFar = 0;
        for (int i = 0; i < arr.length; i++) {
        maxEndingHere += arr[i];
        if (maxEndingHere < 0) {
        maxEndingHere = 0;
        }
        if (maxSoFar < maxEndingHere) {
        maxSoFar = maxEndingHere;
        }
        }
    return maxSoFar;
        
    }
    
}
