public class RotateLeft3 {

	/*
	 * Given an array of ints length 3, return an array with the elements
	 * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	 * 
	 * rotateLeft3([1, 2, 3]) → [2, 3, 1] rotateLeft3([5, 11, 9]) → [11, 9, 5]
	 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
	 */

	public int[] rotateLeft3(int[] nums) {
		int[] newArray = new int[nums.length];
		newArray[0] = nums[1];
		newArray[1] = nums[2];
		newArray[2] = nums[0];
		return newArray;
	}

}
