package Recursion;

public class print_path {
    public static void print(int er, int ec, int cr, int cc, String ans){
        if(cr == er && cc ==ec){
            System.out.println(ans+" ");
            return;
        }
        if(cr>er || cc>ec) return;

        print(er, ec, cr, cc+1, ans+"H");
        print(er, ec ,cr+1, cc, ans+"V");
    }


    public static void main(String[] args) {
        int m = 3;   // row
        int n =3;    //col

        print(m-1, n-1,0,0,"");
    }
    
}
