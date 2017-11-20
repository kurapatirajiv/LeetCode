public class LongestPalindromicString {
public static int lo, maxLen;

public static void main(String args[]){

	String s = "abb"; //test case try "aaaaaaa"
	String result = longestPalindrome(s);			
	System.out.println(result);
}

// Solution : https://discuss.leetcode.com/topic/23498/very-simple-clean-java-solution
public static String longestPalindrome(String s) {
	int len = s.length();
	if (len < 2)
		return s;
	
    for (int i = 0; i < len-1; i++) {
    	    System.out.println("Loop "+i);
       	 	extendPalindrome(s, i, i);  //Expanding from mid is equally distributed
        	extendPalindrome(s, i, i+1); //Expanding from mid is not equally distributed, w/o i+ 1 the starting index will reach to -1 before the speeding pointer reaches to the end
    }
    return s.substring(lo, lo + maxLen);
}

public static void extendPalindrome(String s, int j, int k) {
	System.out.println("Comparing values:"+j+": "+k);
	while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
		j--;
		k++;
	}
	if (maxLen < k - j - 1) {
		lo = j + 1;
		maxLen = k - j - 1;
	}

	System.out.println("Setting new maxLen:"+maxLen);
	System.out.println("Setting new lo:"+lo);
}}