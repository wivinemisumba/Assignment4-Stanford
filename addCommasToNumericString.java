
import acm.graphics.*;
public class addCommasToNumericString {

	public static main(String[] args) {
		String addCommasToNumericString(String digits) {
			String result = "";
			int len = digits.length();
			int nDigits = 0;
			for (int i = len - 1; i >= 0; i--) {
			result = digits.charAt(i) + result;
			nDigits++;
			if (((nDigits % 3) == 0) && (i > 0)) {
			result = "," + result;
			}
			}
			return result;
			}


	}

}
