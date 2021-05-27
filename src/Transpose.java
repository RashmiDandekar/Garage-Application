import java.util.Scanner;

public class Transpose {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[][]= new int[n][n];
		int t[][]= new int[n][n];
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				t[j][i]= a[i][j];
			}
		}
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
	}
}
