package LeetCode;
public class single_element {
    public static void single(int arr[])
    {
        int n = arr.length;
        int ans =-1;
        int count=0;

        for(int i=1; i<n-1; i++)
        {
           
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                ans = arr[i];
            }
           


        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        

        int nums[] = {1,2,2,3,3,4,4};
        single(nums);
    }
    
}
