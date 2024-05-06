package StackAndQueue;

public class Queue {
     int[] arr;
     int size;
     int front;

    public Queue(){
        arr = new int[5];
    }
    public Queue(int n)
    {
        arr =new int[n];
    }
    // empty
    public boolean isEmpty(){
        return size ==0;
    }
    public boolean isFull(){
        return size == arr.length;
    }
    public void enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full !!");
        }
        int idx = (size+front) % arr.length;
        arr[idx] = item;
        size++;
    }
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty !!");
        }
        int v = arr[front];
        return v;
    }
    public int size(){
        return size;
    }
    public void Display(){
        for(int i=0; i<size; i++)
        {
            int idx = (front+i) % arr.length;
            System.out.print(arr[idx]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

      

        q.Display();
    }
    
}
