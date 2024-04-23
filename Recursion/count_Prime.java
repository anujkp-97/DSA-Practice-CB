package Recursion;
// we wil use sieve of erastosthenes theorem to count the prime no. 

public class count_Prime {
    public static int countPrime(int n)
    {
        int[] prime = new int[n+1];
        prime[0]= 1;            // 1 means not a prime no. 
        prime[1] =1;

        for(int i=2; i*i<=n; i++)
        {
            if(prime[i] ==0){
                for(int j=2; i*j<prime.length; j++){
                    prime[i*j] =1;
                }
            }
        }

        int ans =0;
        for(int i=2; i<prime.length; i++)
        {
            if(prime[i] ==0) ans++;

        }
        return ans;
    }
    public static void main(String[] args) {
        int n=10;

       int ans = countPrime(n);
       System.out.println(ans);
    }
    
}
