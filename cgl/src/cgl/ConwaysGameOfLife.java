package cgl;


//Vishal 20031J0013
//Took reference from geeksforgeeks and youtube

public class ConwaysGameOfLife extends CGLBoard {
	public ConwaysGameOfLife(int size, int[][] cell) {
		super(size, cell);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayint=new int[6][2];
		 arrayint[0][0]=0;
		 arrayint[0][1]=4;
		 arrayint[1][0]=1;
		 arrayint[1][1]=1;
		 arrayint[2][0]=2;
		 arrayint[2][1]=1;
		 arrayint[3][0]=3;
		 arrayint[3][1]=2;
		 arrayint[4][0]=5;
		 arrayint[4][1]=4;
		 
		 CGLBoard b = new CGLBoard(6,arrayint);
		 boolean[][] newboard=b.createBoard(6, arrayint);
		System.out.println(b.printBoard(newboard));
		
		
		b.generateNextGeneration(newboard);
		System.out.println(b.printBoard(newboard));
		
		
		
	}

}
