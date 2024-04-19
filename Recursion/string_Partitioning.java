package Recursion;

public class string_Partitioning {
    public static void print(String ques, String ans, int c)
    {
        if(ques.length() ==0)
        {
            System.out.println(ans);
           
            return;
        }
       
        c++;

        for(int i=1; i<=ques.length(); i++)
        {
            String s = ques.substring(0, i);

            print(ques.substring(i), ans+s+"|",c);
        }

    }

    public static void main(String[] args) {
        
        String ques = "nitin";

        print(ques, "",0);
    }
    
}
