package Array;

public class min_roate_sortedArray {
    public static int print(int arr[])
    {
        int low =0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while(low<high)
        {
            int mid = low + (high-low)/2;

            if(arr[low]< arr[high])
            {
                high = mid-1;
                ans = Math.min(arr[high],ans);
            }
            else{
                low = mid+1;
                ans = Math.min(ans, arr[low]);
            }
        }





        return ans;
    }
    public static void main(String[] args) {
        
        int arr[] ={11,13,15,17};

        int res = print(arr);
        System.out.println(res);
    }
    
}
