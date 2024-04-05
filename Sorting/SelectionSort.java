package Sorting;
/*
 * We created two method first to find the minimum element from the index i to end
 * Second method to swap the minimum element with the initial index
 */
public class SelectionSort {
    public static int minimum(int arr[], int index)
    {
        int idx = index;
        for(int j = index+1; j<arr.length; j++)
        {
            if(arr[j] < arr[idx])
                idx = j;
        }
        return idx;
    }
    public static int[] print(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int idx = minimum(arr, i);
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
                    

    public static void main(String[] args) {
        int arr[] = {2,3,8,4,-3,-8,-9,9,87};
       
        print(arr);
        
        for(int i=0;i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
