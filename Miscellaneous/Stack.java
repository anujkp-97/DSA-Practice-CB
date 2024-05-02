package Miscellaneous;

/*
 *  1. isEmpty(), 2. isFull(), 3. push, 4. Pop(), 5. peek()
 */

public class Stack {
    private int[] arr;
    private int idx;

    // initialize the stack
    public Stack(){
        arr = new int[5];
    }
    // variable length of stack
    public Stack(int n)
    {
        arr = new int[n];
    }

    // check empty
    public boolean isEmpty(){
        return idx ==0;
    }
    // check full
    public boolean isFull()
    {
        return arr.length == idx;
    }
    public int size(){
        return idx;
    }
    // push
    public void push(int n) throws Exception
    {
        if(isFull()){
            throw new Exception("Full !!!");
        }
        arr[idx] = n;
        idx++;

    }
    // pop
    public int pop() throws Exception
    {
        if(isEmpty()){
            throw new Exception("Empty !!!");
        }

        int v = arr[idx-1];
        idx--;
        return v;
    }
    public int peek() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Empty !!!");
        }
        int v = arr[idx-1];
        

        return v;

    }
    // display
    public void display(){
        for(int i=0; i<idx; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    
}
