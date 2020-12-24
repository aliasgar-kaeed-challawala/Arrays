import java.io.*;
import java.util.*;

class MaxMin
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = s.nextInt();    
        int[] arr; 
        int max_1;
        int min_1;
        arr = new int[n]; 
        for(int i=0; i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        min_1 = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min_1)
            {
                min_1 = arr[i];
            }
        }
        max_1 = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max_1)
            {
                max_1 = arr[i];
            }
        }
        System.out.println("the max element in the array is " + max_1);
        System.out.println("the min element in the array is " + min_1);
    }
}