package LeetCode.Striver;

public class lower_bound {

    public static int lower(int arr[], int x)
    {
        int result =-1;
        int low =0;
        int high = arr.length-1;
        while(low<=high){
                int i = (low+high)/2;

                if(arr[i] >= x){
                    result =i;
                    break;
                }
                else if(arr[i]> x){
                    high = i-1;
                }
                else{
                    low = i+1;
                }

        }
            

        

        return result;
    }
    public static void main(String[] args) {
        int arr[] ={3,5,8,15,19};
        int x =9;

       System.out.println( lower(arr, x));
    }
    
}
