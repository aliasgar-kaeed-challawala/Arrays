import java.io.*;
import java.util.*;



class Oneside
{
    
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Number of elts in the array");
        int n = s.nextInt();
        int arr[];
        arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        
        int temp,j=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<0)
            {
                if(i!=j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

}