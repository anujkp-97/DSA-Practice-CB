package LeetCode;

public class subarray_sum_equals_k {
    public static void sum(int arr[], int k){
            int count =0;
            int element = 0;

            for(int i=0; i<arr.length; i++)
            {
                element = arr[i];
                for(int j=i; j<arr.length; j++)
                {
                    if(element == k){
                        count++;
                    }
                    element+= arr[j];
                }
            }
            System.out.println(count);
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3};

        sum(arr,3);
    }
    
}
