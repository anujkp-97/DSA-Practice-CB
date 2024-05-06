package StackAndQueue;
import StackAndQueue.Queue;
public class DynamicQueuue extends Queue{
    @Override
	public void enqueue(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < size; i++) {
				int idx = (front + i) % arr.length;
				newarr[i] = arr[idx];

			}
			front = 0;
			arr = newarr;
		}
		super.enqueue(item);

	}
    public static void main(String[] args) throws Exception {
        DynamicQueuue dq = new DynamicQueuue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(80);
		dq.Display();
    }
}
