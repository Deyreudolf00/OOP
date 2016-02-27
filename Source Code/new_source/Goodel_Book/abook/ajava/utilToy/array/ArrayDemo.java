package abook.ajava.utilToy.array;

import java.util.*;

public class ArrayDemo {
	public static void main(String[] args) {
		demo01();
	}

	public static void demo01() {
		Arrays.sort(persons);
		List list = Arrays.asList(persons);
		displayList(list);
	}

	static void displayList(List list) {
		System.out.println("The size of the list is: " + list.size());
		ListIterator i = list.listIterator(0);
		while (i.hasNext()) {
			Object o = i.next();
			if (o == null)
				System.out.println("null");
			else
				System.out.println(o.toString());
		}
	}

	private static String persons[] = { "Jannet", "Emir", "Lisa", "Jamie",
			"Pierre", "Stanley", "Gloria", "Ben", "Ken", "Lela" };
}
