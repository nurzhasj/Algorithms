public class GenericFixedCapacityStack<T>
{
	private T[] s;
	private int n = 0;

	public GenericFixedCapacityStack(int capacity)
	{
		s = (T[]) new Object[capacity];
	}

	public boolean isEmpty()
	{
		return n == 0;
	}

	public void push(T item)
	{
		s[n++] = item;
	}

	public T pop()
	{
		T item = s[--n];
		s[n] = null;
		return item;
	}
}