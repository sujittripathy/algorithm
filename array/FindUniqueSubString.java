public class FindUniqueSubString {

    public static void main(String[] s) {
		String sStr = uniqueSubStr("whatbnhgwhywhereqwetuo");
		System.out.println(sStr);
	}

	private static String uniqueSubStr(String str) {
		int start = 0;
		int end = start+1;
		String maxStr = "";
		String currStr = str.charAt(start)+"";
		while(start < end) {
			if(str.charAt(end) != str.charAt(start)
			&& currStr.indexOf(str.charAt(end)) == -1) {
				currStr = currStr + str.charAt(end);
				end += 1;
			} else {
				if(currStr.length() > maxStr.length()) {
					maxStr = currStr;
				}
				start += 1;
				currStr = str.charAt(start)+"";
				end = start + 1;
			}
			if(end > str.length()-1) {
				end = str.length() - 1;
			}
		}
		return maxStr;
	}
}