
import acm.program.*;
private String removeAllOccurrences(String str, char ch) {
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	if (str.charAt(i) != ch) {
	result += str.charAt(i);
	}
	}
	return result;
	}


}
