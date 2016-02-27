package abook.ajava.autil.stackToy;
import java.util.Stack;

public class StackToy {
	static void test() {
		Stack s = new Stack();
		s.push("Satu");
		s.push("Dua");
		s.push("Tiga");

		System.out.println("Puncak stack: " + s.peek());
		while (!s.empty())
			System.out.println(s.pop());
	}

	public static void main(String args[]) {
		test();
	}
}
