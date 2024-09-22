package practice;
import java.io.*;


public class Solution {
	public static void pArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void swap(int[] a, int i, int cid) {
		int temp=a[i];
		a[i]=a[cid];
		a[cid]=temp;
		System.out.print("Swap: ");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		
	}
	public static void permutation(int a[], int cid) {
	    if (cid == a.length) {
	        pArray(a);
	        return;
	    }
	    for (int i = cid; i < a.length; i++) {
	        swap(a, i, cid);
	        permutation(a, cid + 1);
	        swap(a, i, cid);
	    }
	}

    public static void main(String[] args){
    	int arr[]= {1,2,3};
    	permutation(arr,0);
    }
}
