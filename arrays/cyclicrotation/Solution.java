package arrays.cyclicrotation;

import java.util.Arrays;

/**
 * This class implements a solution to the Cyclic Array Rotation problem
 * @see https://codility.com/programmers/task/cyclic_rotation/
 * @author gustavo
 *
 */
public class Solution {
	
	/**
	 * main method for testing purposes
	 * @param args 
	 */
	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6,7};
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(test, 100)));
	}
	
	/**
	 * cyclic rotation array problem solution
	 * @param A Array to be rotated
	 * @param K Number of indexes to shift array elements
	 * @return Array containg solution
	 */
	public int[] solution(int[] A, int K) {
		
		/* create a clone of received array */
		int[] rotatedArray = A.clone();
		int newPos = 0;
		
		/* for every element in A, determine its new position according to rotation index K */
		/* insert element in new position in the duplicate array */ 
		for(int i=0 ; i < A.length ; i++) {
			newPos = (i + K) % A.length;
			rotatedArray[newPos] = A[i]; 
		}
		
		/* return rotated array */
		return rotatedArray;
	}	
}
