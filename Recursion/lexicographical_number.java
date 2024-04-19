package Recursion;

public class lexicographical_number {
    public static void print(int curr, int n)
    {
        if(curr>n) return;

        System.out.print(curr+" ");
        int i=0; 
        if(curr ==0) i=1;

        for(; i<=9; i++){
            print(curr*10+i, n);
        }
    }

    public static void main(String[] args) {
        int n=20;


        print(0, n);
    }
    
}
