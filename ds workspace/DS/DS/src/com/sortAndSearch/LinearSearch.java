package com.sortAndSearch;

public class LinearSearch {

	public static void main(String[] args) {
		int [] arr= {10,23,4,56,46};
		int f= 56;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==f) {
				flag =true;
				break;
			}
		
		if(flag)System.out.println("found");
		else
			System.out.println("not found");
	}
	
}
