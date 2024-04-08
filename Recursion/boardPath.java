package Recursion;
// boardPath 
public class boardPath {
    public static void print(int n, int sum, String ans)
    {
        if(sum ==n){
            System.out.print(ans + " ");
            return;
        }
        if(sum >n) return ;

        
       for(int i=1; i<n; i++){
        print(n, sum+i, ans+i);
       }
    }
    public static void main(String[] args) {
        // intput-- n=4;
        // output -- [1111, 112, 13, 121, 211, 22, 31]       // sum equal to the n
        /*
         *        n= 4, [1,2,3,4]
         */

         int n=4; 
         print(n,0,"");
    }
    
}
