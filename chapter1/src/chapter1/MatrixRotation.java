package chapter1;

public class MatrixRotation {
	
	public static int[][] rotate(int[][] im)
	{
		int rows = im.length;
		int cols = im[0].length;
		
		int[][] ans = new int[rows][cols];
		
		for(int i = 0; i < rows; i++)
		{
			int new_cols = cols - i;
			for(int j = 0; j < cols; j++)
			{
				ans[j][new_cols-1] = im[i][j];
			}
		}
		return ans;
	}
}
