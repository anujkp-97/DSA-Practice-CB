package Array;

public class maximumSum_subarray {

    public static void subarray(int nums[])
    {
       
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            int sum =0;
            for(int j=i; j<n; j++)
            {
                sum+= nums[j];

                ans = Math.max(ans, sum);
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        int nums[] ={-2,1,-3, 4,1};

        subarray(nums);
    }
    
}
