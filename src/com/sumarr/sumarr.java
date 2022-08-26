package com.sumarr;

public class sumarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		int n = arr.length;
		int sum = 5;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((arr[i]+arr[j])==sum) {
					System.out.println(arr[i] +","+arr[j]);
				}
			}
		}
	}

}
