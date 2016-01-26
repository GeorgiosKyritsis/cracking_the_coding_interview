package chapter1;

import java.util.Arrays;

public class permutation {
	
	public static boolean isPermutation(String str1, String str2)
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		for(int i = 0; i < charArray1.length; i++)
		{
			if(charArray1[i] != charArray2[i])
				return false;
		}

		return true;
	}

}
