package Sorting;

public class insertionSort {
    public static void minimunLast(int []arr, int i)
    {
            int item = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > item)
            {
                arr[j+1] = arr[j];
                arr[j] = item;
                j--;          
        }

     
    }
    public static void print(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            minimunLast(arr, i);
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,-1, 6, -2};
        
        print(arr);

        //print the array
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
