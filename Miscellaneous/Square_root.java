package Miscellaneous;
public class Square_root {

    public static int print(int n){
        int result =-1;

        for(int i=1; i<n/2; i++)
        {
            if(i*i <= n)
            {
                result = i;
              
            }
            if(i*i>n) break;

        }
        return result;

    }
    public static void main(String[] args) {
        int n = 25;

        // print(n);
        System.out.println(print(n));
    }
    
}
