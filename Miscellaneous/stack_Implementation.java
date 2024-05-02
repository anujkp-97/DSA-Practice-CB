package Miscellaneous;

public class stack_Implementation {
    public static void main(String[] args) throws Exception {
        
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
    
}
