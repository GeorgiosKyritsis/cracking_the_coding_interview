package chapter1;

public class stringCompression {
	
	public static String compress(String str)
	{
		char[] c = str.toCharArray();
		int counter = 0;
		char temp = c[0];
		String ans = "";
		int index = 0;
		
		for (int i = 0; i < c.length; i++)
		{
			if (c[i] == temp)
			{
				index = i;
				counter++;
				temp = c[i];
			}
			else
			{
				ans = ans + c[index] + counter;
				index = i;
				counter = 1;
				temp = c[i];
			}
		}
		return ans + c[index] + counter;
	}
}