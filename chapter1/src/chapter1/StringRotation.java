package chapter1;

public class StringRotation {
	
	public static boolean isRotation(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;
		if(!(str1+str1).contains(str2))
			return false;
		return true;
	}
}
