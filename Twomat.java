class Test{

	public static void main(String [] args){

		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};


		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+a[i][j]);

			}
			System.out.print("  +  ");
			for(int k=0;k<b.length;k++)
			{
				System.out.print(" "+b[i][k]);
			}
			System.out.println();
		}
		
	}
}