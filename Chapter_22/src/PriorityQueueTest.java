import java.util.*;
public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("z");
		pq.add("c");
		pq.add("a");
		pq.add("b");
		pq.add("y");
		
		for (String o : pq)
			System.out.println(o);
		System.out.println("원소삭제");
		while(!pq.isEmpty())
			System.out.println(pq.remove());
	}

}
