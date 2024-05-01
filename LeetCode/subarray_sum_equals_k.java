package LeetCode;

public class subarray_sum_equals_k {
    public static int sum(int arr[], int k){
        int n = arr.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            int sum = 0;
            for (int j = i; j < n; j++) { // ending index j
                // calculate the sum of subarray [i...j]
                // sum of [i..j-1] + arr[j]
                sum += arr[j];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        
        int arr[]={1,1,1};
 
        int res = sum(arr,2);
        System.out.println(res);
    }
    
}
