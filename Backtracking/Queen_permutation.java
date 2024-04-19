package Backtracking;

public class Queen_permutation {
    public static void print(boolean[]  b, int tq, String ans, int qc)
    {

            if(qc == tq){
                System.out.print(ans+" ");
                return;
            }

        for(int i=0; i<b.length; i++)
        {
            if(b[i] == false){
                b[i] = true;

               print(b, tq, ans+"b"+i+"q"+qc, qc+1);
            }
            b[i] = false;
        }


    }
    public static void main(String[] args) {
        // input is the number of queen and no. of seat

        int tq =2;
        boolean b[] = new boolean[4];

        print(b, tq, "",0);
    }
    
}
