package Miscellaneous;

public class queue_implementation {
    public static void main(String[] args) throws Exception{
        
        Queue q  = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.size());
        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}
