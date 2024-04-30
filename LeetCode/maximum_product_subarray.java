package LeetCode;

public class maximum_product_subarray {
    public static void subarray(int arr[]){
        int n = arr.length;

        int max =0;
        int product =0;

        for(int i=0; i<n; i++)
        {
            product = arr[i];
            for(int j=i+1; j<n; j++)
            {
                product = product*arr[j];
                max = Math.max(max, product);
            }
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        
        /*
         * Input: nums = [2,3,-2,4]
            Output: 6
            Explanation: [2,3] has the largest product 6.
         */

         int arr[] = {2,3,-2,4};

         subarray(arr);
    }
    
}
