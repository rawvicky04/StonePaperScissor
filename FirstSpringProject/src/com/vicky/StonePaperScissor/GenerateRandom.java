package com.vicky.StonePaperScissor;

import java.util.Random;

public class GenerateRandom {
	
	Random random = new Random();
	
	public int randomValue() {
	
		int value = random.nextInt(3);
		return value+1;
	
	}
	
	public void notImp() {
		for(int i = 0 ; i < 84 ; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
