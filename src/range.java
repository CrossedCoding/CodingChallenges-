import java.util.*;

import java.lang.*;

import java.io.*;

import java.lang.Math;

public class range {

	public static int favorite(int L, int R, int N, int A[]) {

		int result = 0;

		// Write Your Logic Here:

		for (int i = 0; i < N; i++) {
			if (A[i] <= R && A[i] >= L) {

				result += 1;

			}

		}

		return result;
	}

	public static void main(String[] args) {

		// INPUT [uncomment & modify if required]

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();

		int R = sc.nextInt();

		int N = sc.nextInt();

		int A[] = new int[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();

		}

		// OUTPUT [uncomment & modify if required]

		System.out.print(favorite(L, R, N, A));

		sc.close();
	}
}