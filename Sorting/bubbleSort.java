package Sorting;
/*
 * In Bubble sort , the largest element in array reach at the last and loop ek baar km chalegi
 * turn - kitni baar array 
 */
public class bubbleSort {
    public static int[] print(int arr[])
    {
        int n = arr.length;
        for(int turn =1; turn<n; turn++)
        {
            for(int j=0; j<n-turn; j++){
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        
       int arr[] = {2,1,5,6,4,9,5,3};
       print(arr);

       //print arr after sorting
       for(int i= 0; i<arr.length; i++)
       {
        System.out.print(arr[i]+" ");
       }

    }
    
}
