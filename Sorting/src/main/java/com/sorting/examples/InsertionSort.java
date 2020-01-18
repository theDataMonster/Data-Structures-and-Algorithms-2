package com.sorting.examples;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int arr[]= {3,4,10,2,12,5,100,76,1,30};
		
		for(int i=1;i<arr.length;i++)
		{
			int j;
			int key=arr[i];
			System.out.println("i="+i);
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]>key)
				{
					arr[j+1]=arr[j];
					System.out.println("Inside loop");
					System.out.println(arr[j]);
				}
				else
				{
					break;
				}
			}
			arr[j+1]=key;
			System.out.println("Outside for loop");
			System.out.println(j);
		}
		System.out.println("outside loop");
		Arrays.stream(arr).forEach(System.out::println);
		
	}

}
