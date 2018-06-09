package com.deek.datastructures2;

import java.util.Scanner;

public class primenumberimplementation {
	public static void main(String[] args) throws Exception {
		primenumber p = new primenumber();
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = p.prime(i);
		if (j == 1)
			System.out.println("prime");
		else
			System.out.println("not a prime");
	}

}
