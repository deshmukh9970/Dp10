package com.array.task;



public class Task4 {
	public static void main(String[] args) {
		int[][] arr={{22, 31, 9}, {12,5,16}, {34, 42, 2}} ;
		
		int min;
		for(int i=0;i<arr.length;i++) {
			min=Integer.MAX_VALUE;
			for(int j=0;j<arr[i].length;j++) {
				if(min>arr[i][j]) {
					min=arr[i][j];
				}
			}
			System.out.println(min);
		}
	}
}

