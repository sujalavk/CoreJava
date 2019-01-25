import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(80);
		list.add(20);
		list.add(30);
		list.add(30);
		// first method

		for (Integer i : list) {
			System.out.println(i);
		}
		
        
		System.out.println("Using Iterator");
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Using ListIterator");
		ListIterator li = list.listIterator(list.size());
		while (li.hasPrevious())
			System.out.println(li.previous());

	}

}
