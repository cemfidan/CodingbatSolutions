public class MiddleThree {

	/*
	 * Given a string of odd length, return the string length 3 from its middle, so
	 * "Candy" yields "and". The string length will be at least 3.
	 * 
	 * middleThree("Candy") → "and" 
	 * middleThree("and") → "and"
	 * middleThree("solving") → "lvi"
	 */

	public String middleThree(String str) {
		if (str.length() > 3) {
			return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
		}
		return str;
	}

}
