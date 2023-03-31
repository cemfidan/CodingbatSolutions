import java.util.List;

/*
 * Given a list of strings, return a list where each string has "*" added at its end.
 * 
 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 * addStar(["hello", "there"]) → ["hello*", "there*"]
 * addStar(["*"]) → ["**"]
 */

public class AddStar {

	public List<String> addStar(List<String> strings) {
		strings.replaceAll(n -> n + "*");
		return strings;
	}

}
