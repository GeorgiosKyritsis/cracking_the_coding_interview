package chapter1;

public class tester {

	public static void main(String[] args) {
		
		//Question 1
		String str1 = "George";
		String str2 = "monopoly";
		String str3 = "Mario";
		
		System.out.println("Is the word: " + str1 + " unique? " + uniqueCharacters.isUnique(str1));
		System.out.println("Is the word: " + str2 + " unique? " + uniqueCharacters.isUnique(str2));
		System.out.println("Is the word: " + str3 + " unique? " + uniqueCharacters.isUnique(str3));

		//Question 2
		String str4 = "George";
		String str5 = "monopoly";
		String str6 = "Polymono";
		
		System.out.println("Is permutation? " + permutation.isPermutation(str4, str5));
		System.out.println("Is permutation? " + permutation.isPermutation(str5, str6));
		
		//Question 3
		char[] c = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', '9'
					, '0', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; 

		urlify.replaceSpaces(c, 16);
		
		//Question 4
		String str7 = "George";
		String str8 = "Tact Coa";
		String str9 = "kaak";
		
		System.out.println("Is palindrome? " + palindrome.isPalindrome(str7));
		System.out.println("Is palindrome? " + palindrome.isPalindrome(str8));
		System.out.println("Is palindrome? " + palindrome.isPalindrome(str9));
		
		//Question 5
		System.out.println("Is one away? " + oneAway.isOneAway("plk", "plae"));
		System.out.println("Is one away? " + oneAway.isOneAway("palesa", "pale"));
		System.out.println("Is one away? " + oneAway.isOneAway("pale", "bale"));
		System.out.println("Is one away? " + oneAway.isOneAway("pale", "bake"));
		
		//Question 6
		System.out.println(stringCompression.compress("aabddccddcccaaaf"));
	}

}
