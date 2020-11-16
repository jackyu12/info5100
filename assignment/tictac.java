package hello;

import java.util.Scanner;

public class tictac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[][] gameBoard = {
	                {' ', '|', ' ', '|', ' '},
	                {'-', '+', '-', '+', '-'},
	                {' ', '|', ' ', '|', ' '},
	                {'-', '+', '-', '+', '-'},
	                {' ', '|', ' ', '|', ' '},
	        };

	       // printGameBoard(gameBoard);


	       while (true) {
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Enter your placement (1-9): ");
	            int playerPos = scan.nextInt();
	            placePiece(gameBoard,playerPos,"player");
	            printGameBoard(gameBoard);
	            System.out.println("Enter cpu placement (1-9): ");
	            int cpuPos = scan.nextInt();
	            placePiece(gameBoard,cpuPos,"cpu");
	            printGameBoard(gameBoard);
	            
	            if(checkEmpty(gameBoard)==true) {
	            	scan.close();
	            	break;
	            }}
	       System.out.println(checkWinner(gameBoard));
	            // write your code here
	}
	public static boolean checkEmpty(char[][]gameBoard) {
		for(int i=0;i<gameBoard.length;i+=2) {
			for(int j=0;j<gameBoard[0].length;j+=2) {
				if(gameBoard[i][j]==' ')return false;
			}
		}
		return true;
	}
	        public static void printGameBoard(char[][] gameBoard) {
	        	for(int i=0;i<gameBoard.length;i+=2) {
	        		
	        		for(int j=0;j<gameBoard[0].length;j+=2) {
	        			System.out.print(gameBoard[i][j]);
	        		}
	        		System.out.println();
	        	}
	        	
	           
	        }

	        public static void placePiece(char[][] gameBoard, int pos, String user) {

	            //char symbol = ' ';
	            if (user.equals("player")) {
	                //symbol = 'X';
	                playerPositions(pos,gameBoard);
	            } else if (user.equals("cpu")) {
	                //symbol = 'O';
	                cpuPositionsadd(pos,gameBoard);
	            }
	            
	            // write your code here

	        }

	        public static String checkWinner(char[][] gameBoard) {
	        	if(gameBoard[0][0]==gameBoard[2][2]&&gameBoard[2][2]==gameBoard[4][4]||gameBoard[0][4]==gameBoard[2][2]&&gameBoard[2][2]==gameBoard[4][0]) {
	        		if(gameBoard[2][2]=='X') {
	        			return "human";
	        		}else if(gameBoard[2][2]=='O') {
	        			return "cpu";
	        		}}
	        		int j=0;
	        		for(int i=0;i<=4;i+=2) {
	        			if(gameBoard[i][j]==gameBoard[i][j+2]&&gameBoard[i][j+2]==gameBoard[i][j+4]) {
	        				if(gameBoard[i][j]=='X') {
	    	        			return "human";
	    	        		}else if(gameBoard[i][j]=='O') {
	    	        			return "cpu";
	    	        		}
	        			}
	        		}
	        		for(int i=0;i<=4;i+=2) {
	        			if(gameBoard[j][i]==gameBoard[j+2][i]&&gameBoard[j+2][i]==gameBoard[j+4][i]) {
	        				if(gameBoard[j][i]=='X') {
	    	        			return "human";
	    	        		}else if(gameBoard[j][i]=='O') {
	    	        			return "cpu";
	    	        		}
	        			}
	        		}
	        		return "game is tie or not finished";
	        	
	        	
	            // write your code here
	        }
	        public static void playerPositions(int pos,char[][]gameBoard) {
	        	switch(pos) {
	        	case 1:
	        		if(gameBoard[0][0]==' ') {
	        			gameBoard[0][0]='X';}
	        		
	        		break;
	        	case 2:
	        		if(gameBoard[0][2]==' ') {
	        			gameBoard[0][2]='X';}
	        		break;
	        	case 3:
	        		if(gameBoard[0][4]==' ') {
	        			gameBoard[0][4]='X';}
	        		break;
	        	case 4:
	        		if(gameBoard[2][0]==' ') {
	        			gameBoard[2][0]='X';}
	        		break;
	        	case 5:
	        		if(gameBoard[2][2]==' ') {
	        			gameBoard[2][2]='X';}
	        		break;
	        	case 6:
	        		if(gameBoard[2][4]==' ') {
	        			gameBoard[2][4]='X';}
	        		break;
	        	case 7:
	        		if(gameBoard[4][0]==' ') {
	        			gameBoard[4][0]='X';}
	        		break;
	        	case 8:
	        		if(gameBoard[4][2]==' ') {
	        			gameBoard[4][2]='X';}
	        		break;
	        	case 9:
	        		if(gameBoard[4][4]==' ') {
	        			gameBoard[4][4]='X';}
	        		break;
	        	}
	        }
	        public static void cpuPositionsadd(int pos,char[][]gameBoard) {
	        	switch(pos) {
	        	case 1:
	        		if(gameBoard[0][0]==' ') {
	        			gameBoard[0][0]='O';}
	        		
	        		break;
	        	case 2:
	        		if(gameBoard[0][2]==' ') {
	        			gameBoard[0][2]='O';}
	        		break;
	        	case 3:
	        		if(gameBoard[0][4]==' ') {
	        			gameBoard[0][4]='O';}
	        		break;
	        	case 4:
	        		if(gameBoard[2][0]==' ') {
	        			gameBoard[2][0]='O';}
	        		break;
	        	case 5:
	        		if(gameBoard[2][2]==' ') {
	        			gameBoard[2][2]='O';}
	        		break;
	        	case 6:
	        		if(gameBoard[2][4]==' ') {
	        			gameBoard[2][4]='O';}
	        		break;
	        	case 7:
	        		if(gameBoard[4][0]==' ') {
	        			gameBoard[4][0]='O';}
	        		break;
	        	case 8:
	        		if(gameBoard[4][2]==' ') {
	        			gameBoard[4][2]='O';}
	        		break;
	        	case 9:
	        		if(gameBoard[4][4]==' ') {
	        			gameBoard[4][4]='O';}
	        		break;
	        	}
	        }

}



