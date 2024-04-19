package Recursion;

public class Coin_permutation {
    public static void print(int arr[], int amount, int sum, String ans)
    {
        if(sum == amount){
            System.out.println(ans);
            return;
        }
        if(sum>amount) return;

        for(int i=0; i<arr.length; i++)
        {
            int n = arr[i];

            print(arr, amount, sum+n, ans+n);
        }

    }
    public static void main(String[] args) {
        
        int arr[]= {2,3,5};
        int amount = 7;

        print(arr, amount, 0, "");
    }
    
}
