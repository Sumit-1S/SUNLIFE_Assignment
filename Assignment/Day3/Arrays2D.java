package Day3;

public class Arrays2D {
	public static void main(String[] args) {
		int firstMatrix[][] = {{1,1,1},{1,1,1}};
		int secondMatrix[][]= {{2,2,2},{2,2,2}};
		int sumMatrix[][] = new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; 
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sumMatrix[i][j]); 
			}
			System.out.println();
		}
	}
}
