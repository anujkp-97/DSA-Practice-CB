package Array;

public class rotatePath_k_times {
    public static void reverse(int arr[], int i, int j)
    {
         // we swap the element
         while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
         }
    }
    
        public static void rotate(int arr[])
        {
            int n= arr.length;
            int k=6;
            
            // optimal approach used reverse
                 k= k%n;
            reverse(arr, 0, n-k-1);
            reverse(arr, n-k, n-1);
            reverse(arr, 0, n-1);


            // optimal approach end

                    /*  Brute force approach */

         /* 
            
            for(int j=1; j<=k; j++){
                int item = arr[n-1];
            for(int i=n-1; i>0; i--){
                arr[i] = arr[i-1];

            }
            arr[0] = item;
        } 
        */
       
           
        }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        rotate(arr);

        for(int i=0; i<5; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    
}
