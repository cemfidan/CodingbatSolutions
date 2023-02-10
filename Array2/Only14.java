public class Only14 {
	
	/*
	 * Given an array of ints, return true if every element is a 1 or a 4.
	 * 
	 * only14([1, 4, 1, 4]) → true
	 * only14([1, 4, 2, 4]) → false
	 * only14([1, 1]) → true
	 */

	public boolean only14(int[] nums) {
		for (int i : nums) {
			if (i != 1 && i != 4) {
				return false;
			}
		}
		return true;
	}

}
