package Miscellaneous;
/*
 *  Input : [1, 2, 3]
 *   Output : [1], [1, 2], [2], [1, 2, 3], [2, 3], [3]

 *   Input : [1, 2]
*  Output : [1], [1, 2], [2]
 */

public class print_subArray {
    public static void subarray(int arr[], String ans, int idx){

        // base case
        if(idx == arr.length){
            System.out.print(ans+" ");
            return;
        }

        for(int i=idx; i< arr.length; i++)
        {
            subarray(arr, ans, idx+1);
            subarray(arr, ans+arr[i], idx+1);
        }


    }

    public static void main(String[] args) {
        int arr[] ={1,2,3};

        subarray(arr,"",0);
    }
    
}
