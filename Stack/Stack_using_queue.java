package Stack;
// code exception

import StackAndQueue.DynamicQueuue;

public class Stack_using_queue {
    private DynamicQueuue q;
    
    public Stack_using_queue(){
        q = new DynamicQueuue();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
    public int size(){
        return q.size();
    }
    
    public void push(int item) throws Exception{
        if(isEmpty()){
            q.enqueue(item);
        }
        else{
            DynamicQueuue h = new DynamicQueuue();

            while(!q.isEmpty()){
                h.enqueue(h.dequeue());
            }
            q.enqueue(item);

            while(!h.isEmpty()){
                q.enqueue(h.dequeue());
            }
        }
    }
    public int pop() throws Exception{
        return q.dequeue();
    }
    public int peek() throws Exception{
        return 0;
    }

    public static void main(String[] args) throws Exception {
        Stack_using_queue s = new Stack_using_queue();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());
    }
}
