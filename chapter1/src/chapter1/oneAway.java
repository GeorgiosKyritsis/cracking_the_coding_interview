package chapter1;

public class oneAway {
	
	public static boolean isOneAway(String str1, String str2)
	{
		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();
		
		if (str1.length() == str2.length())
			return replaceCharacter(c1, c2);
		else if (str1.length() - 1 == str2.length())
			return insertCharacter2(c1, c2);
		else if (str1.length() == str2.length() - 1)
			return insertCharacter1(c1, c2);
		else
			return false;	
	}
	//Helper functions
	private static boolean replaceCharacter(char[] a, char[] b)
	{
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != b[i])
				count++;
		}
		if (count<2)
				return true;
			return false;
	}
	
	private static boolean insertCharacter1(char[] a, char[] b)
	{
		int count = 0;
		int index1 = 0;
		int index2 = 0;
		
		for (int i = 0; i < Math.max(a.length, b.length); i++)
		{
			if(index1 == Math.max(a.length, b.length)-1)
				return true;
			
			if(a[index1] == b[index2])
			{
				index1++;
				index2++;
			}
			else
			{
				index2++;
				count++;
			}
		}
		if (count <  2)
			return true;
		return false;
		
	}
	
	private static boolean insertCharacter2(char[] a, char[] b)
	{
		int count = 0;
		int index1 = 0;
		int index2 = 0;
		
		for (int i = 0; i < Math.max(a.length, b.length); i++)
		{
			if(index2 == Math.max(a.length, b.length)-1)
			return true;
			
			if(a[index1] == b[index2])
			{
				index1++;
				index2++;
			}
			else
			{
				index1++;
				count++;
			}
		}
		if (count <  2)
			return true;
		return false;
		
	}
}
