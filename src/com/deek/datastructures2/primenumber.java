package com.deek.datastructures2;

public class primenumber {
	public int prime(int n) {
		int flag = 0;
		for (int i = 2; i < java.lang.Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			return 1;
		else
			return -1;
	}

}
