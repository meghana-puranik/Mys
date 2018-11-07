package patterns;

public class Patt1 {
	public static void main(String[] args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			int k=0;
			int m=1;
			for(int j=0;j<n;j++)
			{
				
				if(i+j>=n-1)
				{
					if(k%2==1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(m++);
					}
				}
				else
				{
					System.out.print(" ");
				}
				k++;
			}
			System.out.println();
		}
	}

}
