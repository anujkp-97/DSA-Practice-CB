package Miscellaneous;

public class Queue {
    private int arr[];
    private int idx;
    private int front;

    public Queue(){
        arr = new int[5];
    }
    public Queue(int size){
        arr = new int[size];
    }

    public boolean isEmpty(){
        return idx ==0;
    }
    // full
    public boolean isFull(){
        return idx == arr.length;
    }

    // add the element
    public void enqueue(int item) throws Exception
    {
        if(isFull()){
            throw new Exception("Full !!!");
        }
        int index = (idx+front)%arr.length;
        arr[index] = item;
        idx++;
    }
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty !!!");
        }
        int v = arr[front];
        front = (front + 1) % arr.length;
		idx--;
        return v;
    }
    public int size(){
        return idx;
    }

    public void display(){
        for(int i=0; i<idx; i++)
        {
            int index = (front+i)%arr.length;
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }
    
}
