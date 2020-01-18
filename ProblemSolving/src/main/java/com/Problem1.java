package com;

public class Problem1 {
	

		public static void main(String args[]){

		char arr[][]={{'a','b','c','d','e'},{'f','g','h','i','j'},{'k','l','m','n','o'},{'p','q','r','s','t'},{'u','v','w','x','y'}};


		int start=0;
		int end=4;

		while(start<=end){
			
			if(start==end)
			{
				System.out.print(arr[start][start]+" ");
				break;
			}
			else {

				for(int i=start;i<=end;i++){
					System.out.print(arr[start][i]+" ");
					}

					for(int i=start;i<=end;i++){
					System.out.print(arr[i][end]+" ");
					}

					for(int i=end;i>=start;i--){
					System.out.print(arr[i][end]+" ");
					}

					start++;
					for(int i=end;i>=start;i--){
					System.out.print(arr[i][start-1]+" ");
					}
					end--;
			}

			}
		}}

