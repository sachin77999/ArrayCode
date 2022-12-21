import java.lang.*;
import java.io.*;
import java.util.*;
public class LeftRotationKNumberOfTimes {
    
    public static void main(String args[])
    {
        int arr[]={1,3,5,7,9};
        int n = arr.length;

        int k = 2;
        leftRotate(arr,n,k);

        k = 3;
        leftRotate(arr,n,k);

        k = 4;
        leftRotate(arr,n,k);
    }
    static void leftRotate(int arr[],int n,int k)
    {
        int mod = k%n;
        for(int i=0;i<n;++i)
        System.out.println(arr[(i+mod)%n]+" ");
        System.out.println();
    }
}
