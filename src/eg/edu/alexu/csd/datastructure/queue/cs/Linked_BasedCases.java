package eg.edu.alexu.csd.datastructure.queue.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Linked_BasedCases {

	@Test
	void test() {
		LinkedBasedQueue Q=new LinkedBasedQueue();
		String Expected="empty Queue";
		try {
			Q.dequeue();
		}
		catch(RuntimeException e){
			assertTrue(e.getMessage().equals(Expected));
		}
		assertEquals(true,Q.isEmpty());
		assertEquals(0,Q.size());
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		assertEquals(Q.size(),3);
		assertEquals(Q.dequeue(),10);
		
	}
	

}
