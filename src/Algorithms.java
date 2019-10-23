import java.util.Arrays;
import java.util.NoSuchElementException;

public class Algorithms
{
    public int getKthMinimum(int[] a, int k)
    {
        if (k < 0 || k >= a.length)
        {
            throw new IllegalArgumentException();
        }
        int[] b = Arrays.copyOf(a, a.length);
        Arrays.sort(b);
        return b[k];
    }
}
