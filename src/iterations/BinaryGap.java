package iterations;

/**
 * This class implements a solution to BinaryGap problem
 * @see https://codility.com/programmers/task/binary_gap/
 * @author gustavo
 *
 */
public class BinaryGap {

	/**
	 * main method for testing purposes
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryGap solution = new BinaryGap();
		System.out.println(solution.solution(777));
	}


	/**
	 * solution method to calculate a number's binary gap
	 * @param N input number to calculate its binary gap
	 */
	public int solution(int N) {

		/* variables to be used */
		int i;
		int currentGap = 0;
		int biggestGap = 0;

		/* converts number to binary using division by two method
		 *  and updates biggest gap at each sequence of zeros 
		 *  found between ones */
		for(i = N ; i > 0 ; i = i/2) {
			/* if we found a one we start counting a new gap */
			if( i % 2 == 1 ) {
				
				/* move cursor to next binary number */
				i = i/2;
				currentGap = 0;
				/* while we see zeroes we count ! */
				while (i > 0 && (i % 2) == 0) {
					currentGap++;
					if(currentGap > biggestGap) {
						biggestGap = currentGap;
					}
					i = i/2;
				}
				/* rewind cursor to previous binary number */
				i = i*2;
					
			}
		}

		return biggestGap;
	}
}
