class Test{

	public static void main(String [] args){

		int a[][]={{1,3,4},{5,6,7},{8,9,10}};
		int b[][]={{1,1,1},{1,1,1},{1,1,1}};


		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+a[i][j]);

			}
			if(i==1)
			System.out.print("   +  ");
		else
			System.out.print("      ");

			for(int k=0;k<b.length;k++)
			{
				System.out.print(" "+b[i][k]);
			}
		//	System.out.println();
		
		int c[][]={{0,0,0},{0,0,0},{0,0,0}};

		
			if(i==1)
			System.out.print("   =  ");
		else
			System.out.print("      ");

			for(int d=0;d<a.length;d++)
			{
				c[i][d]=a[i][d]+b[i][d];
                System.out.print(" "+c[i][d]);
			}

		
			System.out.println();
		}
	}
}