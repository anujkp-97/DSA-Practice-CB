package Miscellaneous;
import java.util.*;

public class add_element_last_stack {
    public static void addLast(Stack<Integer> st, int item){
            // base case
            if(st.isEmpty()){
                st.push(item);
                return;
            }

            int pop = st.pop();
            addLast(st, item);
            st.push(pop);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x = st.pop();
        reverse(st);
        addLast(st, x);
    }
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(30);
        st.push(20);
        st.push(10);
        System.out.println(st);
        
        addLast(st, 40);
        addLast(st, 50);

        System.out.println(st);
        System.out.println("--------------------------------------");
        reverse(st);
        System.out.println(st);
    }
    
}
