package Array;


public class kadaneAlgo {
    
    public static void print(int arr[])
    {
            
            int ans = Integer.MIN_VALUE;

            int sum =0;

            for(int i=0; i<arr.length; i++)
            {
                sum += arr[i];
                ans = Math.max(ans, sum);

                if(sum<0)
                    sum=0;
            }

            System.out.println(ans);
    }

    public static void main(String[] args) {
        int nums[] ={-2,1,-3};

        print(nums);
    }
}
