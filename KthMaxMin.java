import java.util.*;
import java.io.*;
class KthMaxMin{
public static void main(String args[]) 
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter length of array");
    int n = s.nextInt();    
    int[] arr; 
    int k;
    arr = new int[n]; 
    for(int i=0; i<n;i++)
    {
        arr[i] = s.nextInt();
    }    
    System.out.println("Enter The kth value");
    k = s.nextInt();
    Arrays.sort(arr);
    System.out.println("The " + k+"th smallest element in the given array is " + arr[k-1]);  
}
}

