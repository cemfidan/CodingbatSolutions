public class No14 {
	
	/*
	 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
	 * 
	 * no14([1, 2, 3]) → true
	 * no14([1, 2, 3, 4]) → false
	 * no14([2, 3, 4]) → true
	 */

	public boolean no14(int[] nums) {
		boolean presence1 = false;
		boolean presence4 = false;
		for (int i : nums) {
			if (i == 1) {
				presence1 = true;
			} else if (i == 4) {
				presence4 = true;
			}
		}
		return !presence1 || !presence4;
	}

}
