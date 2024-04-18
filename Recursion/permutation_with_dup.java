package Recursion;

public class permutation_with_dup {
    public static void print(String ques, String ans)
    {   
        if(ques.length() ==0)
        {
            
            System.out.println(ans);
       
            return;
        }
        for(int i=0; i<ques.length(); i++)
        {
            int val=0;
            char ch = ques.charAt(i);
            for(int j=i+1; j<ques.length(); j++)
            {
                if(ques.charAt(j) == ch){
                    val =1;
                    break;
                }
            }
            if(val ==0){
                String s1 = ques.substring(0,i);
                String s2 = ques.substring(i+1);

                print(s1+s2, ans+ch);
            }
        }
    }
    public static void main(String[] args) {
        String str = "abca";

        print(str , "");
    }
    
}
