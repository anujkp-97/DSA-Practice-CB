package Recursion;

public class tossCoin {
    public static void print(int n,String ans)
    {
        if(n ==0)
        {
            System.out.print(ans + " ");
            return;
        }

        print(n-1, ans+"H");
        print(n-1, ans+"T");
    }
    public static void main(String[] args) {
        int n=3;

        print(n,"");
    }
    
}
