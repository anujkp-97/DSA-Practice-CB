package Searching;
public class binarySearch {
    public static int print(int N, int k)
    {
        int ans=0;
        int low =0;
        int high =N;
        
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(Math.pow(mid, k) <= N)
                {
                    ans = mid;
                    low = mid+1;
                }
            else{
                high = mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int res = print(217, 4);

        System.out.println(res);
    }
    
}
