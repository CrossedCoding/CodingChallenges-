import java.util.*;

import java.lang.*;

import java.io.*;

import java.lang.Math;

public class arrayvalues {

	public static int smallInteger(int N, int X, int A[]) {

		// this is default OUTPUT. You can change it

		int result = 0;

		// WRITE YOUR LOGIC HERE:
		
		// Unsorted solution
		
//		int temp = 999999999;
//		
//		for (int i = 0; i < N; i++) {
//			
//			if (A[i] > X && A[i] < temp) {
//				
//				temp = A[i];
//				
//				result = temp;
//				
//				
//			}
//		
//		}
		
		// Sorted solution
		
		for (int i = 0; i < A.length; i++) {

			for (int j = i + 1; j < A.length; j++) {

				int temp = 0;

				if (A[i] > A[j]) {

					temp = A[i];

					A[i] = A[j];

					A[j] = temp;

				}

			}

		}

		int temp = 0;

		for (int i = 0; i < N; i++) {

			if (A[i] > X) {

				temp = A[i];

				if (A[i + 1] > temp) {

					result = temp;

					return result;

				}

			}
		}

		return result;

	}

	public static void main(String[] args) {

		// INPUT [uncomment & modify if required]

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int X = sc.nextInt();

		int A[] = new int[N];

		for (int i = 0; i < A.length; i++) {

			A[i] = sc.nextInt();

		}

		// OUTPUT [uncomment & modify if required]

		System.out.print(smallInteger(N, X, A));

		sc.close();

	}

}