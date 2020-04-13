package com.vicky.StonePaperScissor;

public class GamePlayer {
	
	private int Player;

	public int getPlayer() {
		return Player;
	}

	public void setPlayer(int player) {
		Player = player;
	}
	
	public String playerValue(int n) {
		
		String test = "- ";
		
		if(n == 1) {
			test = "Stone";
		}else if(n == 2) {
			test = "Paper";
		}else if(n == 3) {
			test = "Scissor";
		}
		
		return test;
	}

}
