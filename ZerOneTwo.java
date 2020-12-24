import java.io.*;
import java.util.*;

class ZerOneTwo
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c0=0,c1=0,c2=0;
        int arr[]; 
        arr = new int[n];
        int i = 0; 
        for(int j=0; j<arr.length; j++)
        {
            arr[j] = s.nextInt();
        }

        for(int j=0;j<arr.length;j++)
        {
          if(arr[j] == 0)
          {
              c0++;
          }
          else if(arr[j] == 1)
          {
              c1++;
          }
          else
          {
              c2++;
          }
        }

        
        while(c0>0)
        {
            arr[i++] = 0;
            c0--;
        }
        while(c1>0)
        {
            arr[i++] = 1;
            c1--;
        }
        while(c2>0)
        {
            arr[i++] = 2;
            c2--;
        }
        System.out.println("The sorted array is ");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }

    }
}