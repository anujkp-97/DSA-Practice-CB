package SlidingWindow;

public class subarray_sum_max {
    public static int maximumSum(int arr[], int k)
    {
        int sum =0;
        for(int i=0;i<k; i++){
            sum+=arr[i];
        }
        int ans =sum;

        for(int i=k; i<arr.length; i++)
        {
            //growing
            sum+=arr[i];

            //shrink
            sum-= arr[i-k];

            // update
            ans= Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={2,3,4,1,2,3,7,6,8,2,3};
        int k =3;

        System.out.println(maximumSum(arr, k));

    }
    
}
