package eg.edu.alexu.csd.datastructure.queue.cs;
import eg.edu.alexu.csd.datastructure.linkedList.cs.Classes.*;
public class LinkedBasedQueue implements ILinkedBased, IQueue {
	private SinglyLinked Queue=new SinglyLinked();
	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		Queue.add(item);
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		Object temp;
		if(Queue.isEmpty()) {
			throw new RuntimeException("empty Queue");
		}
		else {
			 temp=Queue.get(0);
			Queue.remove(0);
		}
		return temp;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return Queue.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return Queue.size();
	}

}
