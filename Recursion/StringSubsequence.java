package Recursion;

public class StringSubsequence {
    public static void print(String ques, String ans){
        if(ques.length() ==0){
            System.out.print(ans + " ");
            return;
        }
        char ch = ques.charAt(0);

        print(ques.substring(1), ans);
        print(ques.substring(1), ans+ch);
    
    }

    public static void main(String[] args) {
        String str = "abc";

       
        print(str, "");

    }


    
}
