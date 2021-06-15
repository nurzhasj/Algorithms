public class GenericStack<T>
{
	private Node first = null;

	private class Node
	{
		T item;
		Node next;
	}

	public boolean isEmpty()
	{
		return first == null;
	}

	public void push(T item)
	{
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}

	public T pop()
	{
		T item = first.item;
		first = first.next;
		return item;
	}

	public static void main(String[] args) {
		// GenericStack<String> stack = new GenericStack<>();
		// stack.push("!");
		// stack.push("you");
		// stack.push("love");
		// stack.push("I");
		// System.out.print(stack.pop() + " ");
		// System.out.print(stack.pop() + " ");
		// System.out.print(stack.pop() + " ");
		// System.out.print(stack.pop() + " ");
	
		// GenericStack<Character> stack = new GenericStack<>();
		// stack.push('W');
		// stack.push('M');
		// stack.push('B');
		// System.out.println(stack.pop() + "" + stack.pop() + "" + stack.pop());
		
	}
}