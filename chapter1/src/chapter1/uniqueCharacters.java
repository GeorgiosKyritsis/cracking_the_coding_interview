package chapter1;

public class uniqueCharacters {
	
	
	public static boolean isUnique(String str)
	{
		char[] s = new char[str.length()];
		str = str.toLowerCase();
		str.getChars(0, str.length(), s, 0);
		for (int i = 0; i < s.length; i++)
		{
			for (int j = i + 1; j < s.length; j++)
			{
				if (s[i] == s[j])
					return false;
			}
		}
		return true;	
	}
}
