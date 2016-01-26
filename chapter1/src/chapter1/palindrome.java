package chapter1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;

public class palindrome {

	public static boolean isPalindrome(String str)
	{
		int freq = 0;
		Hashtable<Character, Integer> chars=new Hashtable<Character, Integer> () ;
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		
		for(char ch: charArray)
		{
			if (ch != ' ')
			{
				if (!chars.containsKey(ch))
				{
					freq = 1;
					chars.put(ch, freq);
				}	
				else
				{
					freq++;
					chars.replace(ch, freq);
				}
			}
		}
		
		Collection<Integer> c = chars.values();
		int countOdds = 0;
		for(Integer i: c)
		{
			if (i % 2 == 1)
				countOdds++;
		}
		if (countOdds < 2)
			return true;
		return false;	
	}
}
