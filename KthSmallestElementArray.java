import java.util.Arrays;
import java.util.Collections;
public class KthSmallestElementArray {
    
    public static int KthSmallest(Integer[] arr,int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String args[])
    {
        Integer arr[] = new Integer[]{12,3,5,7,19};
        int k = 2;
        System.out.println("Kth smallest element is "+KthSmallest(arr,k));
    }
}
