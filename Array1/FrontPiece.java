public class FrontPiece {
	
	/*
	 * Given an int array of any length, return a new array 
	 * of its first 2 elements. If the array is smaller than 
	 * length 2, use whatever elements are present.
	 * 
	 * frontPiece([1, 2, 3]) → [1, 2]
	 * frontPiece([1, 2]) → [1, 2]
	 * frontPiece([1]) → [1]
	 */

	public int[] frontPiece(int[] nums) {
		int[] newArray;
		if (nums.length > 1) {
			newArray = new int[2];
			newArray[0] = nums[0];
			newArray[1] = nums[1];
		} else {
			newArray = new int[nums.length];
			if (nums.length == 1) {
				newArray[0] = nums[0];
			}
		}
		return newArray;
	}

}
