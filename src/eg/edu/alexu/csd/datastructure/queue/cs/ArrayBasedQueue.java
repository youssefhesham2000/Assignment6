package eg.edu.alexu.csd.datastructure.queue.cs;

public class ArrayBasedQueue implements IQueue, IArrayBased {
	private int n, f, r, size;
	Object[] arr;
	
	public ArrayBasedQueue(int n) {
		this.n = n;
		this.arr = new Object[n];
	}
	
	@Override
	public void enqueue(Object item) {
		if (size == n) 
			throw new RuntimeException("Queue Full");
		
		
		size++;
		arr[r] = item;
		r = (r+1)%n;
	}

	@Override
	public Object dequeue() {
		if (size == 0)
			throw new RuntimeException("Queue Empty");
		
		size--;
		Object ret = arr[f];
		f = (f+1)%n;
		
		return ret;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}
	
	public void print() {
		int j = f;
		for (int i = 0;i < size;i++, j = (j+1)%n) {
			if (i == size - 1)
				System.out.print("'" + arr[j] + "'.\n");
			else
				System.out.print("'" + arr[j] + "', ");
			
			
		}
		
	}
	
	public void printArray() {
		for (int i = 0;i < n;i++) {
			if (i == n - 1)
				System.out.print("'" + arr[i] + "'.\n");
			else
				System.out.print("'" + arr[i] + "', ");
			
			
		}
		
	}

}
