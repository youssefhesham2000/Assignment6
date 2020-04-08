package eg.edu.alexu.csd.datastructure.queue.cs;

public class ArrayBasedQueue implements IQueue, IArrayBased {
	int n;
	int[] arr;
	
	public ArrayBasedQueue(int n) {
		this.n = n;
		this.arr = new int[n];
	}
	
	@Override
	public void enqueue(Object item) {
		
		
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
