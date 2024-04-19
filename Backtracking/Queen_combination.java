package Backtracking;

public class Queen_combination {
    public static void print(boolean[] b, int tq, String ans, int cq, int idx)
    {
        if(cq == tq)
            {
                System.out.print(ans+" ");
                return;
            }
        for(int i=idx; i<b.length; i++){
            if(b[i] == false){
                b[i] = true;

                print(b, tq, ans+"b"+i+"q"+cq, cq+1, i+1);
                b[i] = false;
            }
        }
    
    }


    public static void main(String[] args) {
        
        int tq =2;
        boolean[] b = new boolean[4];

        print(b, tq, "", 0,0);

    }
    
}
