package chapter1;

public class urlify {
	
	public static void replaceSpaces(char[] c, int l)
	{
		int fin = l;
		
		for (int i = 0; i < fin; i++)
		{
			if (c[i] == ' ')
			{
				for(int j = fin-1; j > i; j--)
				{
					c[j+2] = c[j];
				}
				c[i] = '%';
				c[i+1] = '2';
				c[i+2] = '0';
				fin = fin + 2;
			}
		}
		for(char ch: c)
			System.out.print(ch);
		System.out.println();
	}
}

