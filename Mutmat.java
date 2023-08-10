class Test{

	public static void main(String [] args){

		int a[][]={{1,2,3},{1,2,3},{1,2,3}};
		int b[][]={{1,2,3},{1,2,3},{1,2,3}};
        int c[][]={{0,0,0},{0,0,0},{0,0,0}};
          
          int i,j,k;

		for( i=0;i<3;i++)
		{
			for( j=0;j<3;j++)
			{
				for( k=0;k<3;k++)
				{
                     c[i][j]+=a[i][k]*b[k][j];
			
				}
				System.out.print(c[i][j]+" ");
		     }
		     	System.out.println();
	    }
				
	}
}