import java.util.*;
import java.lang.*;
import java.io.*;

class RotateCyclicByOne {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 0; i<testCase; i++){
	        int n = sc.nextInt();
	        int [] arr = new int [n];
	        for(int j=0; j<n;j++){
	            arr[j] = sc.nextInt();
	        }
	        int temp = arr[n-1];
	        for(int k=n-1;k>0;k--){
	            arr[k] = arr[k-1];
	        }
	        arr[0] = temp;
	        for(int j=0;j<n;j++){
	            System.out.print(arr[j]+" ");
	        }
	        System.out.println();
	        
	    }
	}
}
