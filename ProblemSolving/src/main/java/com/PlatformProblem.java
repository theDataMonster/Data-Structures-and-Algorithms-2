package com;

import java.util.Arrays;

public class PlatformProblem {
	
	//given arrival and departure time of trains find the maximum number of platforms needed at any given time

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {90,94,95,110, 150, 180};
		int dep[]= {91,120,112,113,190,200};
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int plat_needed=1;
		int result=1;
		int i=1,j=0;
		
		while(i< arr.length && j<arr.length) {
			
			if(arr[i]<dep[j]) {
				
				plat_needed++;
				i++;
				if(plat_needed>result)
					result=plat_needed;
			}
			else {
				plat_needed--;
				j++;
			}
		}
		
		System.out.println(result);

	}

}
