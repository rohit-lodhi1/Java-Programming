package Tictak;
import java.util.Scanner;

public class Test {
	static char board[][]= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};    	
	public static void main(String[] args) {        
		char x='X',o='O';
		int pos;
		boolean flag=true,f1=true;
		Scanner sc=new Scanner(System.in);
		print();
		while(flag==true)
		{
			
		move(x);
		print();
		
		flag=checkWin(x);
		if(flag==false)
		    continue;
		flag=gameOver();
		if(flag==false)
			continue;
					
		  move(o);			
		flag=checkWin(o);  
		if(flag==false)
           continue;
		flag=gameOver();
		if(flag==false)
			continue;		
		print();
		}		
	}
	
	public static boolean gameOver()
	{
		int i=0,j=0,f=0;
		for(i=0;i<board.length;i++)
		{
			for(j=0;j<board.length;j++)
			{
				if(board[i][j]==' ')
				  return true;
			}
		}
		System.out.println("GAME OVER :(");
	 return false;
	}
	
	public static boolean checkWin(char x)
	{
	
		if(board[0][0]==x && board[0][1]==x &&board[0][2]==x  ||
		  (board[1][0]==x && board[1][1]==x &&board[1][2]==x) ||
		  (board[2][0]==x && board[2][1]==x &&board[2][2]==x) ||
		  (board[0][0]==x && board[1][0]==x &&board[2][0]==x) ||
		  (board[0][1]==x && board[1][1]==x &&board[2][1]==x) ||
		  (board[0][2]==x && board[1][2]==x &&board[2][2]==x) ||
		  (board[0][0]==x && board[1][1]==x &&board[2][2]==x) ||
		  (board[0][2]==x && board[1][1]==x &&board[2][0]==x))
		{
			System.out.println("\n\n"+x+"Megha Tum Jeet Chuki ho HURRREEEREEE");
			return false;
		}			
		return true;
	}
	
	
	public static void move(char move)throws ArrayIndexOutOfBoundsException{
		System.out.println("Please Entre 1-9");
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		try {
		if(pos<4 && board[0][pos-1]==' ')
	    board[0][pos-1]=move;
		
		else if(pos<7 && board[1][pos-4]==' ')
			board[1][pos-4]=move;
		
		else if(pos<10 && board[2][pos-7]==' ')
			board[2][pos-7]=move;
		}
		catch(ArrayIndexOutOfBoundsException e) {
				move(move);
		}
	}
	
	public static void print()
	{		
		System.out.println(board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
		System.out.println(board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
		System.out.println(board[2][0]+"|"+board[2][1]+"|"+board[2][2]);			
	}
}