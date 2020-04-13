package com.vicky.StonePaperScissor;

public class FinalResult {
	
	int score1,score2, score3, score4;
	
	int arr[][] = new int[5][5];
	
	public void result(int valPlayer1, int valPlayer2, int valPlayer3, int valPlayer4) {
		
		if(valPlayer1 == valPlayer2) {
			//This is just to test whether it is working or not..
			//System.out.println("Tie between player1 and player 2");
		}
		if(valPlayer1 == valPlayer3) {
			//System.out.println("Tie between player 1 and player 3");
		}
		if(valPlayer1 == valPlayer4) {
			//System.out.println("Tie between player 1 and player 4");
		}
		if(valPlayer2 == valPlayer3) {
			//System.out.println("Tie between player 2 and player 3");

		}
		if(valPlayer2 == valPlayer4) {
			//System.out.println("Tie between player 2 and player 4");

		}
		if(valPlayer3 == valPlayer4) {
			//System.out.println("Tie between player 3 and player 4");

		}
		//For Player 1...
		if(valPlayer1 == 1) {
			if(valPlayer2 == 2) {
				//System.out.println("Player 1 Looses with Player 2.");
			}
			else if(valPlayer2 == 3) {
				//System.out.println("Player 1 wins with Player 2.");
				arr[1][2]++;
			}
			if(valPlayer3 == 2) {
				//System.out.println("Player 1 looses with Player3.");
			}
			else if(valPlayer3 == 3) {
				//System.out.println("Player 1 wins with Player3.");
				arr[1][3]++;
			}
			if(valPlayer4 == 2) {
				//System.out.println("Player 1 looses with Player 4.");
			}
			else if(valPlayer4 == 3) {
				//System.out.println("Player 1 wins with Player 4.");
				arr[1][4]++;
			}
		}
		if(valPlayer1 == 2) {
			if(valPlayer2 == 1) {
				//System.out.println("Player 1 wins with Player 2.");
				arr[1][2]++;
				
			}
			else if(valPlayer2 == 3) {
				//System.out.println("Player 1 looses with Player 2.");
			}
			if(valPlayer3 == 1) {
				//System.out.println("Player 1 wins with Player 3.");
				arr[1][3]++;
			}
			else if(valPlayer3 == 3) {
				//System.out.println("Player 1 looses with Player 3.");
			}
			if(valPlayer4 == 1) {
				//System.out.println("Player 1 wins with Player 4.");
				arr[1][4]++;
			}
			else if(valPlayer4 == 3) {
				//System.out.println("Player 1 looses with Player 4.");
			}
		}
		if(valPlayer1 == 3) {
			if(valPlayer2 == 1) {
				//System.out.println("Player 1 looses with Player 2.");
			}
			else if(valPlayer2 == 2) {
				//System.out.println("Player 1 wins with Player 2.");
				arr[1][2]++;
			}
			if(valPlayer3 == 1) {
				//System.out.println("Player 1 looses with Player 3.");
			}
			else if(valPlayer3 == 2) {
				//System.out.println("Player 1 wins with Player 3.");
				arr[1][3]++;
			}
			if(valPlayer4 == 1) {
				//System.out.println("Player 1 looses with Player 4.");
			}
			else if(valPlayer4 == 2) {
				//System.out.println("Player 1 wins with Player 4.");
				arr[1][4]++;
			}	
		}
		//For Player 2...
		
		if(valPlayer2 == 1) {
			if(valPlayer1 == 2) {
				//System.out.println("Player 2 looses with Player 1.");
			}
			else if(valPlayer1 == 3) {
				//System.out.println("Player 2 wins with Player 1.");
				arr[2][1]++;
			}
			if(valPlayer3 == 2) {
			//	System.out.println("Player 2 looses with Player 3.");
			}
			else if(valPlayer3 == 3) {
				//System.out.println("Player 2 wins with Player 3.");
				arr[2][3]++;
			}
			if(valPlayer4 == 2) {
				//System.out.println("Player 2 looses with Player 4.");
			}
			else if(valPlayer4 == 3) {
				//System.out.println("Player 2 wins with Player 4.");
				arr[2][4]++;
			}
		}
		if(valPlayer2 == 2) {
			if(valPlayer1 == 1) {
				//System.out.println("Player 2 wins with Player 1.");
				arr[2][1]++;
				
			}
			else if(valPlayer1 == 3) {
				//System.out.println("Player 2 looses with Player 1.");
			}
			if(valPlayer3 == 1) {
				//System.out.println("Player 2 wins with Player 3.");
				arr[2][3]++;
			}
			else if(valPlayer3 == 3) {
				//System.out.println("Player 2 looses with Player 3.");
			}
			if(valPlayer4 == 1) {
				//System.out.println("Player 2 wins with Player 4.");
				arr[2][4]++;
			}
			else if(valPlayer4 == 3) {
				//System.out.println("Player 2 looses with Player 4.");
			}
		}
		if(valPlayer2 == 3) {
			if(valPlayer1 == 1) {
				//System.out.println("Player 2 looses with Player 1.");
			}
			else if(valPlayer1 == 2) {
				//System.out.println("Player 2 wins with Player 1.");
				arr[2][1]++;
			}
			if(valPlayer3 == 1) {
				//System.out.println("Player 2 looses with Player 3.");
			}
			else if(valPlayer3 == 2) {
				//System.out.println("Player 2 wins with Player 3.");
				arr[2][3]++;
			}
			if(valPlayer4 == 1) {
				//System.out.println("Player 2 looses with Player 4.");
			}
			else if(valPlayer4 == 2) {
				//System.out.println("Player 2 wins with Player 4.");
				arr[2][4]++;
			}	
		}
		
		//For Player 3...
		
		if(valPlayer3 == 1) {
			if(valPlayer2 == 2) {
				//System.out.println("Player 3 Looses with Player 2.");
			}
			else if(valPlayer2 == 3) {
				//System.out.println("Player 3 wins with Player 2.");
				arr[3][2]++;
			}
			if(valPlayer1 == 2) {
				//System.out.println("Player 3 looses with Player 1.");
			}
			else if(valPlayer1 == 3) {
				//System.out.println("Player 3 wins with Player 1.");
				arr[3][1]++;
			}
			if(valPlayer4 == 2) {
				//System.out.println("Player 3 looses with Player 4.");
			}
			else if(valPlayer4 == 3) {
				//System.out.println("Player 3 wins with Player 4.");
				arr[3][4]++;
			}
		}
		if(valPlayer3 == 2) {
			if(valPlayer2 == 1) {
				//System.out.println("Player 3 wins with Player 2.");
				arr[3][2]++;
				
			}
			else if(valPlayer2 == 3) {
				//System.out.println("Player 3 looses with Player 2.");
			}
			if(valPlayer1 == 1) {
				//System.out.println("Player 3 wins with Player 1.");
				arr[3][1]++;
			}
			else if(valPlayer1 == 3) {
				//System.out.println("Player 3 looses with Player 1.");
			}
			if(valPlayer4 == 1) {
				//System.out.println("Player 3 wins with Player 4.");
				arr[3][1]++;
			}
			else if(valPlayer4 == 3) {
				//System.out.println("Player 3 looses with Player 4.");
			}
		}
		if(valPlayer3 == 3) {
			if(valPlayer2 == 1) {
				//System.out.println("Player 3 looses with Player 2.");
			}
			else if(valPlayer2 == 2) {
				//System.out.println("Player 3 wins with Player 2.");
				arr[3][2]++;
			}
			if(valPlayer1 == 1) {
				//System.out.println("Player 3 looses with Player 1.");
			}
			else if(valPlayer1 == 2) {
				//System.out.println("Player 3 wins with Player 1.");
				arr[3][1]++;
			}
			if(valPlayer4 == 1) {
				//System.out.println("Player 3 looses with Player 4.");
			}
			else if(valPlayer4 == 2) {
				//System.out.println("Player 3 wins with Player 4.");
				arr[3][1]++;
			}	
		}
		
		//For Player 4...
		if(valPlayer4 == 1) {
			if(valPlayer2 == 2) {
				//System.out.println("Player 4 Looses with Player 2.");
			}
			else if(valPlayer2 == 3) {
				//System.out.println("Player 4 wins with Player 2.");
				arr[4][2]++;
			}
			if(valPlayer3 == 2) {
			//	System.out.println("Player 4 looses with Player3.");
			}
			else if(valPlayer3 == 3) {
				//System.out.println("Player 4 wins with Player3.");
				arr[4][3]++;
			}
			if(valPlayer1 == 2) {
				//System.out.println("Player 4 looses with Player 1.");
			}
			else if(valPlayer1 == 3) {
				//System.out.println("Player 4 wins with Player 1.");
				arr[4][1]++;
			}
		}
		if(valPlayer4 == 2) {
			if(valPlayer2 == 1) {
				//System.out.println("Player 4 wins with Player 2.");
				arr[4][2]++;
				
			}
			else if(valPlayer2 == 3) {
				//System.out.println("Player 4 looses with Player 2.");
			}
			if(valPlayer3 == 1) {
				//System.out.println("Player 4 wins with Player 3.");
				arr[4][3]++;
			}
			else if(valPlayer3 == 3) {
				//System.out.println("Player 4 looses with Player 3.");
			}
			if(valPlayer1 == 1) {
				//System.out.println("Player 4 wins with Player 1.");
				arr[4][1]++;
			}
			else if(valPlayer1 == 3) {
			//	System.out.println("Player 4 looses with Player 1.");
			}
		}
		if(valPlayer4 == 3) {
			if(valPlayer2 == 1) {
				//System.out.println("Player 4 looses with Player 2.");
			}
			else if(valPlayer2 == 2) {
				//System.out.println("Player 4 wins with Player 2.");
				arr[4][2]++;
			}
			if(valPlayer3 == 1) {
				//System.out.println("Player 4 looses with Player 3.");
			}
			else if(valPlayer3 == 2) {
				//System.out.println("Player 4 wins with Player 3.");
				arr[4][3]++;
			}
			if(valPlayer1 == 1) {
				//System.out.println("Player 4 looses with Player 1.");
			}
			else if(valPlayer1 == 2) {
				//System.out.println("Player 4 wins with Player 1.");
				arr[4][1]++;
			}	
		}
		
		System.out.printf("%14s%-14s%-14s%-14s%-14s%-14s"," ","| Players","| Player1","| Player2","| Player3","| Player4");
		System.out.print("|");
		System.out.println();

		
		for(int i = 1 ; i < 5; i++) {
			
			if(i == 1) {
				System.out.printf("%-14s%-14s","Player Wins","| Player"+ i);
			}else {
				System.out.printf("%14s%-14s"," ","| Player"+ i);
			}
			
			for(int j = 1; j< 5; j++) {
				System.out.print("| ");
				System.out.printf("%-12d",arr[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}
		
	}

}
