package Searching;
public class linearsearch {
    public static int linear(int arr[], int n)
    {

            for(int i=0; i<arr.length; i++)
            {
                if(arr[i] == n){
                    return 1;
                }
            }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {3,4,4,5,6,7,8};
        int n=6;

       int res = linear(arr, n);
       if(res==1) System.out.println("Element found");
       else System.out.println("Element not found");
      
    }

    
}
