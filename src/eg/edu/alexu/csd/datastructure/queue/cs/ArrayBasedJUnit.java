package eg.edu.alexu.csd.datastructure.queue.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayBasedJUnit {

	@Test
	void test() {
		ArrayBasedQueue q = new ArrayBasedQueue(5);
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		assertEquals(q.size(), 5);
		assertThrows(RuntimeException.class, () -> {
		    q.enqueue('e');
		});
		
		assertEquals((int)q.dequeue(), 0);
		assertEquals((int)q.dequeue(), 1);
		assertEquals((int)q.dequeue(), 2);
		assertEquals((int)q.dequeue(), 3);
		assertEquals((int)q.dequeue(), 4);
		
		assertEquals(q.size(), 0);
		assertEquals(q.isEmpty(), true);
		assertThrows(RuntimeException.class, () -> {
		    q.dequeue();
		});
		
		
		//testing circular assignment
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		assertEquals((int)q.dequeue(), 0);
		assertEquals((int)q.dequeue(), 1);
		assertEquals((int)q.dequeue(), 2);
		assertEquals(q.size(), 2);
		q.print();
		
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		assertThrows(RuntimeException.class, () -> {
		    q.enqueue(8);
		});
		q.print();
		q.printArray();
		
		q.dequeue();
		q.dequeue();
		q.print();
		
		
		
		
	}

}
