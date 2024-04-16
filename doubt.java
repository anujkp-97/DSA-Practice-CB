public class doubt {
    public static void print(int n)
    {
        int ans = 1;
        
        while(n>0)
        {
            int num = n%10;
            ans = ans*num;
            n = n/10;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        

        int n = 3245;

        print(n);
    }
    
}
