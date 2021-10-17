package ram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collecions_test {

	public static void main(String[] args) {

		ArrayList<Integer> i = new ArrayList<Integer>();
		
		i.add(20);
		i.add(30);
		i.add(50);
		i.add(98);
		i.add(87);
		i.add(879);
		System.out.println(i);
		Iterator<Integer> ite = i.iterator();
		while(ite.hasNext()) {
			Integer next = ite.next();
			System.out.println(next);}
			for (int j = 0; j < i.size() ; j++) {
				System.out.println(i);
							
			}
			LinkedList<Object> linkedList = new LinkedList<>();
			linkedList.add("sriram");
			linkedList.add(35);
			linkedList.add("ram");
			System.out.println(linkedList);
			Iterator<Object> iterator = linkedList.iterator();
			while(iterator.hasNext()) {
				Object next2 = iterator.next();
				System.out.println(next2);
			}
			
			
			
			
			
			
		
	}

}
