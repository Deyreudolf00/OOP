package abook.ajava.autil.LlistToy;

import java.util.*;

public class LinkedListDemo {
	static LinkedList ll;

	static void initDemo() {
		System.out.println("Inisialisasi LinkedList ll untuk persiapan DEMO");
		// menciptakan dan inisialisasi Linked List
		ll = new LinkedList();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));
	}

	static void printAll(String str) {
		System.out.print(str);
		// Memperoleh iterator
		Iterator li = ll.iterator();
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println("");
	}

	static void printExtreme(String str) {
		System.out.println(str);
		System.out.println("Minimum : " + Collections.min(ll));
		System.out.println("Maximum : " + Collections.max(ll));
	}

	static void demo01() {
		System.out
				.println("\nDEMO Collections.sort() :: pengurutan terhadap Collections");
		// Menciptakan comparator terbalik
		Comparator r = Collections.reverseOrder();

		// Pengurutan menggunakan comparator r
		Collections.sort(ll, r);
		printAll("List terurut terbalik : ");
	}

	static void demo02() {
		System.out
				.println("\nDEMO Collections.shuffle() :: pengacakan terhadap Collections");
		Collections.shuffle(ll);

		// Menampilkan list secara acak
		printAll("List telah di-shuffle : ");
		printExtreme("Nilai ekstrim di list");
	}

	static void demo() {
		initDemo();
		demo01();
		demo02();
	}

	public static void main(String[] args) {
		demo();
	}
}
