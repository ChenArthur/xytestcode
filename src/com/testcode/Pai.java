package com.testcode;

public class Pai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double N = 100000000;
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			if(Math.pow(Math.random(), 2) + Math.pow(Math.random(), 2) < 1){
				sum++;
			}
		}
		System.out.println("Pi :"+4*sum/N);
	}

}
