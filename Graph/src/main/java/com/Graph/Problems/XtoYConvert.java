package com.Graph.Problems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class Structure{
	
	int val;
	int steps;
	
	public Structure(int val, int steps) {
		
		this.val=val;
		this.steps=steps;
	}
}

public class XtoYConvert {
	
	private static int minOperations(int src, int target) {
		
		Set<Structure> visited=new HashSet<>(1000);
		LinkedList<Structure> queue=new LinkedList<Structure>();
		
		Structure node=new Structure(src,0);
		
		queue.offer(node);
		visited.add(node);
		
		while(!queue.isEmpty()) {
			
			Structure temp=queue.poll();
			System.out.println("Queue poll temp="+temp.val);
			visited.add(temp);
			
			if(temp.val==target) {
				
				return temp.steps;
			}
			
			int mul=temp.val*2;
			int sub=temp.val-1;
			
			if(mul>0 && mul<1000) {
				
				Structure nodeMul=new Structure(mul, temp.steps+1);
				System.out.println("Mul="+mul);
				
				queue.offer(nodeMul);
			}
			
			if(sub>0 && sub<1000) {
				
				Structure nodeSub=new Structure(sub, temp.steps+1);
				System.out.println("Sub="+sub);
				queue.offer(nodeSub);
			}
		}
		
		return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=4,y=13;
		Structure src=new Structure(x,y);
		System.out.println(minOperations(x,y));

	}

}
