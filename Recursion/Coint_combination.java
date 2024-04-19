package Recursion;

public class Coint_combination {
    public static void print(int arr[], int amount, String ans, int idx)
    {
        if(amount ==0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=idx; i<arr.length; i++)
        {
            if(amount>= arr[i])
            {
                print(arr, amount-arr[i], ans+ arr[i], i);
            }
        }
    }
    public static void main(String[] args) {
        int coint[] = {2,3,5};
        int amount = 7;

        print(coint, amount, "", 0);
    }
    
}
