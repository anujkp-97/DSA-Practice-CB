package Recursion;



public class generate_parenthesis {
    public static void print(int n, int open, int close, String ans)
    {
            // Base case
            if(open == close &&n == open){
                System.out.print(ans + " ");
                return;
            }
            if(open >n || close>n || close>open) return;

            // recursive call
            print(n, open+1, close, ans+"(");
            print(n, open, close+1, ans+")");

    }
    public static void main(String[] args)
    {
        int n=3;

        
        print(n, 0, 0, "");
    }
    
}
