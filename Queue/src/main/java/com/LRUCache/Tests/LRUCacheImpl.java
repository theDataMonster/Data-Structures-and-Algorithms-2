package com.LRUCache.Tests;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCacheImpl {
	
	static Deque<Integer> dq;
	static HashSet<Integer> map;
	
	static int csize;
	
	LRUCacheImpl(int n){
		
		dq=new LinkedList<>();
		map=new HashSet<>();
		csize=n;
	}
	
	public void refer(int x) {
		
		if(!map.contains(x)) {
			
			if(dq.size()==csize) {
				
				int last=dq.removeLast();
			}
		}
			else {
				
				int index=0,i=0;
				Iterator<Integer> itr=dq.iterator();
				
				while(itr.hasNext()) {
					
					if(itr.next()==x) {
						index=i;
						break;
					}
					
					i++;
				}
				
				dq.remove(index);
			}
			
			dq.push(x);
			map.add(x);
		}
		
		
	public void display() {
		
		Iterator<Integer> itr=dq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
			
		}
	}
	
	public static void main(String[] args) {
		
		LRUCacheImpl ca=new LRUCacheImpl(4);
		
		ca.refer(1);
		ca.refer(2);
		ca.refer(3);
		ca.refer(1);
		ca.refer(4);
		ca.refer(5);
		
		ca.display();
		
		
	}

}
