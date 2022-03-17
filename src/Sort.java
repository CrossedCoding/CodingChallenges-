
import java.util.*;

import java.lang.*;

import java.io.*;

import java.lang.Math;

public class Sort {

	public static int unchangedIndex(int N, int A[]) {

		// this is default OUTPUT. You can change it

		int result = 0;

		// WRITE YOUR LOGIC HERE:
		
		int B[] = A.clone();
	
		Arrays.sort(B);
		
		// Manually sorting B[]
		
//		for (int i = 0; i < B.length; i++) {
//
//			for (int j = 1; j < B.length; j++) {
//
//				int temp = 0;
//
//				if (B[i] > B[j]) {
//
//					temp = B[i];
//
//					B[i] = B[j];
//
//					B[j] = temp;
//
//				}
//
//			}
//
//		}
		
		for (int i = 0; i < N; i++) {

			if (B[i] == A[i]) {

				result += 1;

			}

		}

		return result;

	}

	public static void main(String[] args) {

		// INPUT [uncomment & modify if required]

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A[] = new int[N];

		for (int i = 0; i < A.length; i++) {

			A[i] = sc.nextInt();

		}

		// OUTPUT [uncomment & modify if required]

		System.out.print(unchangedIndex(N, A));

		sc.close();

	}

}
