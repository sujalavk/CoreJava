
import java.util.*;

public class VectorDemo {
public static void main(String[] args) {
	Vector<Integer> vector = new Vector<>();
	vector.add(10);
	vector.add(80);
	vector.add(20);
	vector.add(30);
	vector.add(30);
	
	// first method

	for (Integer i : vector) {
		System.out.println(i);
	}
	System.out.println("Using Iterator");
	Iterator it = vector.iterator();
	while (it.hasNext())
		System.out.println(it.next());
	
	System.out.println("capacity of list:"+vector.capacity());
	System.out.println("size of list:"+vector.size());
	vector.setSize(6);
	System.out.println("capacity of list:"+vector.capacity());
	System.out.println("size of list:"+vector.size());
	
    
}
}
