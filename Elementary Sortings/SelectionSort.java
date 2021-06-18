import java.util.Scanner;
public class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Comparable[] arr = new Comparable[n];

        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }

        for (int i=0;i<n;i++)
        {
            int min = i;
            for (int j=i+1;j<n;j++)
                if(less(arr[j], arr[min]))
                    min = j;
            exch(arr, i, min);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static boolean less(Comparable  v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}