package LeetCode.Striver;

public class upper_bound {
    public static int upper(int arr[], int x)
    {
        int ans=0;
        // for(int i=0;i<arr.length; i++)
        // {
        //     if(arr[i] >x){
        //         ans = i;
        //         break;
        //     }
        // }

            int low = 0;
            int high = arr.length-1;
            while(low<=high)
            {
                int mid = (low+high)/2;
                if(arr[mid] >x){
                    ans = mid;
                   
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
                
            }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,2,3};
        int x =2;

       System.out.println( upper(arr, x));
    }
    
}
