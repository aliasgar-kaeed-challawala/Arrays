import java.io.*;
import java.util.*;

class ReverseArray
{
    public static void main(String args[])
    
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = s.nextInt();    
        int[] arr; 
        int temp;
        int j = n-1;
        arr = new int[n]; 
        for(int i=0; i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        
        for (int i = 0; i < n / 2; i++) 
        { 
            temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
            j--;
        }
        System.out.println("Reversed Array is");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }

}