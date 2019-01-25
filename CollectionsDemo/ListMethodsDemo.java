import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class ListMethodsDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("banglore");
		list.add("mysore");
		list.add("Belgaum");
		list.add("Hubli");
		list.add("Tumkur");
		System.out.println("Using Iterator");
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("Element at 3rd postion:"+list.get(2));
		list.remove("mysore");
		 it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		list.clear();
		
		System.out.println("Number of objects:"+list.size());
		
	}

}
