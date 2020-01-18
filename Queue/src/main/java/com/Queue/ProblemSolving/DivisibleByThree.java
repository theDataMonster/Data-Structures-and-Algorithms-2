package com.Queue.ProblemSolving;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DivisibleByThree {
	
	public static int populateAux(int aux[], Queue<Integer> queue0, Queue<Integer> queue1, Queue<Integer> queue2) {
		
		int top=0;
		
		while(!queue0.isEmpty()) {
			aux[top++]=queue0.remove();
		}
		
		while(!queue1.isEmpty()) {
			
			aux[top++]=queue1.remove();
		}
		
		while(!queue2.isEmpty()) {
			
			aux[top++]=queue2.remove();
		}
		
		return top;
	}
	
	public static boolean findmaxMultipleOf3(int arr[]) {
		
		Arrays.sort(arr);
		
		Queue<Integer> queue0=new LinkedList<Integer>();
		Queue<Integer> queue1=new LinkedList<>();
		Queue<Integer> queue2=new LinkedList<>();
		
		int sum=0;
		
		for(int i=0; i< arr.length ;i++) {
			
			sum+=arr[i];
			if((arr[i]%3)==0) {
				queue0.add(arr[i]);
			}
			else if((arr[i]%3)==1)
			{
				queue1.add(arr[i]);
			}
			else {
				queue2.add(arr[i]);
			}
		}
		
		if(sum%3==1) {
			
			if(!queue1.isEmpty())
				queue1.remove();
			else {
				
				if(!queue2.isEmpty())
					queue2.remove();
				else
					return false;
				if(!queue2.isEmpty()) {
					queue2.remove();
				}
				else
					return false;
				
			}
		}
		else if((sum%3)==2) {
			
			if(!queue2.isEmpty()) {
				queue2.remove();
			}
			else {
				
				if(!queue1.isEmpty())
					queue1.remove();
				else
					return false;
				
				if(!queue1.isEmpty()) {
					queue1.remove();
				}
				else
					return false;
			}
		}
		
		int aux[]=new int[arr.length];
		
		int top=populateAux(aux, queue0, queue1, queue2);
		
		Arrays.sort(aux, 0, top);
		
		for(int i=top-1; i>=0; i--) {
			System.out.println(aux[i]+" ");
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {8, 1,7,6,0};
		if(!findmaxMultipleOf3(arr))
			System.out.println("Not possible");

	}

}
