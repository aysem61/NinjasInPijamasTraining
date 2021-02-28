package training01;

public class Day01 {

	public static void main(String[] args) {
		/*
		 * Return the sum of the numbers in the array, returning 0 for an empty array.
		 * Except the number 13 is very unlucky, so it does not count and numbers that
		 * come immediately after a 13 also do not count.
		 * 
		 * 
		 * sum13([1, 2, 2, 1]) → 6 sum13([1, 1]) → 2 sum13([1, 2, 2, 1, 13]) → 6
		 */
		int nums[] = { 13, 0, 13, 4 };

		System.out.println(sum13(nums));

	}

	public static int sum13(int[] nums) {

		int temp = 0;

		int i = 0;

		while (i < nums.length) {

			if (nums[i] == 13) {
				i += 2;
			} else {
				temp += nums[i];

				i++;
			}
		}

		return temp;
	}

}
