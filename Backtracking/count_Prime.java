package Backtracking;

public class count_Prime {
    public static int count(int n)
    {
        int ans =0;
        for(int i=2; i<n; i++)
        {
            if(isPrime(i) == true){
                ans++;
            }
        }

        return ans;
    }
    public static boolean isPrime(int n)
    {
        int i=2;
        while(i*i<=n)
        {
            if(n%i ==0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 100;
        int res =count(n);

        System.out.println(res);
    }
    
}
