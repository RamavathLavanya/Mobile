package Arrays;

public class StringPalindrome {
	
	public boolean isPalindrome(String word) {
		char[] charArray=word.toCharArray();
		int start=0;
		int end=word.length()-1;
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
//
//	private Object charArray(int end) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public static void main(String[] args) {
		

		StringPalindrome stringUtil=new StringPalindrome();

		
		if(stringUtil.isPalindrome("that")) {
		  System.out.println("The string is palindrome");
	} else {
		System.out.println("The string is not palindrome");

	}
	}
}



