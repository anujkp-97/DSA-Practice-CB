package StackAndQueue;
/*
 *  all the in_built method of the stack
 * empty(), push(), pop(), peek(), search()
 * we can also use other methods from List and vector ----- add(), capacity(), allAll(),
 *  contains(), elementAt()
 * 
 * Stack implement the List interface and extends vector class
 */

import java.util.Stack;

public class in_built {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
      System.out.println(st.empty());
       
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);
        System.out.println(st.peek());
         System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(10));
        System.out.println(st.empty());


        
    }
    
}
