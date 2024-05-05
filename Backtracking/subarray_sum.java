package Backtracking;
import java.util.*;

public class subarray_sum {
    public static void print(int arr[], int sum, List<Integer> al, List<List<Integer>> ans, int idx)
    {   

        if(sum == 0 )
        {
            ans.add(new ArrayList<>(al));
            return;
            
        }

        for(int i=idx; i<arr.length; i++)
        {
            if(sum>=arr[i]){

                al.add(arr[i]);
                print(arr, sum-arr[i], al, ans, idx);

                al.remove(al.size()-1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {3,4,-7,1,3,3,1,4};
        int sum =7;

        List<Integer> al = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        print(arr, sum, al, ans,0);

        System.out.println(ans);

    } 
}
