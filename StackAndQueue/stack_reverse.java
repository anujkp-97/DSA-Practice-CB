package StackAndQueue;

import java.util.*;

public class stack_reverse {
    public static void reverse(Stack<Integer> st)
    {
        
    }
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>(); 
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);

       System.out.println(st);
       reverse(st);
       System.out.println(st);
    }
    
}
