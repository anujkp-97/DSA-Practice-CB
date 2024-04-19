package Recursion;

public class palindrome_substring {
    public static void print(String ques, String ans)
        {
            // base case
            if(ques.length() ==0)
            {
                System.out.println(ans);
                return;
            }

            // recursive call

            for(int i=1; i<=ques.length(); i++)
            {
                String s = ques.substring(0,i);

                if(is_palindrome(s)== true)
                {
                    print(ques.substring(i), ans+s+"|");
                }
            }

        }

    public static boolean is_palindrome(String s)
    {
        int i=0, j= s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        
        String ques = "nitin";

        String ans="";

        print(ques, ans);
    }
    
}
