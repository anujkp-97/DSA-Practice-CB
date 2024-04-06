package Array;
// Condition --> 
public class productArray_exceptSelf {
    public static void product(int arr[])
    {
            int n = arr.length;
            int left[] = new int[n];
            left[0] = 1;

            for(int i=1; i<n; i++)
            {
                left[i] = left[i-1] * arr[i-1];
            }
            int right[] = new int[n];
            right[n-1] =1;
            
            for(int i = n-2; i>=0; i--)
            {
                right[i] = arr[i+1] * right[i+1];
            }

            for(int i=0; i<n; i++)
            {
                left[i] = left[i]* right[i];
            }
         
            for(int i=0; i<left.length; i++)
        {
            System.out.print(left[i]+ " ");
        }

    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        // output -- 24,12,8,6

        product(arr);

        
    }
    
}
