package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Meeting{
	
	int start;
	int end;
	int pos;
	
	public Meeting() {}
	
	public Meeting(int start, int end, int pos) {
		super();
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
	
	
	
}

class MeetingComparator implements Comparator<Meeting>{

	@Override
	public int compare(Meeting m1, Meeting m2) {
		// TODO Auto-generated method stub
		return m1.end-m2.end;
	}
	
	
}

public class MeetingProblem {
	
	//to find the maximum meetings in one room, given start and end times

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s[]= {1,3,0,5,8,5};
		int f[]= {2,4,6,7,9,9};
		
		List<Meeting> mList=new ArrayList<Meeting>();
		
		
		for(int i=0;i<s.length; i++) {
			
			Meeting m=new Meeting(s[i],f[i],i+1);
			mList.add(m);
		}
		
		Collections.sort(mList, new MeetingComparator());
		List<Integer> positions=new ArrayList<Integer>();
		positions.add(mList.get(0).pos);
		int time_limit=mList.get(0).end;
		
		for(int i=1; i< mList.size();i++) {
			
			if(mList.get(i).start>=time_limit) {
				
				positions.add(mList.get(i).pos);
				
				time_limit=mList.get(i).end;
			}
		}
		
		positions.stream().forEach(System.out::println);
		
//		for(Meeting x:mList) {
//			
//			System.out.println(x.pos);
//		}

	}

}
