package com.chinmaysray.general;

public class FibonacciSeries {

	public int fib(int N) {
		
		if(N <= 1) {
			return N;
		}
		int t0 = 0, t1=1, sum = 0;
		
		for(int i=2; i <=N; i++) {
			sum = t0+t1;
			t0=t1;
			t1=sum;
		}
		
        return sum;
    }
	
	public static void main(String[] args) {
		FibonacciSeries series = new FibonacciSeries();
		System.out.println(series.fib(4));
	}
}
