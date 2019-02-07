package sessions.sessiontwo;

import java.util.Arrays;

public class ArraysThings {
	public static void main(String[] args) {
		int[] arr = new int[5]; // se creaza, in Heap, spatiu pentru 5 val de
								// tip int
		// in memorie si assigneaza valorea lui arr
		arr[2] = 7; // indicele incepe de la 0
		arr[4] = 7;
		// arr=null;
		// arr[5] = 7; ArrayIndexOutOfBoundS
		System.out.println(arr.length);
		System.out.println(arr[0]);
		int n = arr[1];

		System.out.println(Arrays.toString(arr));

		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr2));

		int[][] matrix = { //
				{ 1, 2, 3 }, //
				{ 4, 5, 6, 1 }, //
				{ 7, 8, 9, 1, 100 } //
		};

		System.out.println();

	}

}
