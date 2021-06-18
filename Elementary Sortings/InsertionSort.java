import java.util.Scanner;
public class InsertionSort 
{
	public static void insertionSort(Comparable[] arr)
	{
		for (int i=0; i<arr.length;i++)
		{
			for (int j=i; j>0; j--)
			{
				if(less(arr[j], arr[j-1]))
					exch(arr, j, j-1);
				else break;		
			}	
		}
	}

	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) == -1;
	}

	private static void exch(Comparable[] arr, int i, int j)
	{
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		Comparable[] arr = new Comparable[n];

		for (int i=0; i<n; i++)
		{
			arr[i] = in.nextInt();	
		}

		insertionSort(arr);

		for (int i=0; i<n; i++)
		{
			System.out.println(arr[i] + " ");	
		}

	}
}