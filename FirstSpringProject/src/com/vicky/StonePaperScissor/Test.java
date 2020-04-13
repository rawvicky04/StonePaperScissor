package com.vicky.StonePaperScissor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		GamePlayer Player1 = (GamePlayer)context.getBean("player");
		GamePlayer Player2 = (GamePlayer)context.getBean("player");
		GamePlayer Player3 = (GamePlayer)context.getBean("player");
		GamePlayer Player4 = (GamePlayer)context.getBean("player");
		
		GenerateRandom val = (GenerateRandom)context.getBean("generate");
		FinalResult res = (FinalResult)context.getBean("result");
		
		for(int i = 0; i< 50; i++) {
		
			int p1 = val.randomValue();
			int p2 = val.randomValue();
			int p3 = val.randomValue();
			int p4 = val.randomValue();
			
			System.out.println();
			System.out.println(i+1 + " Iteration");
			System.out.println("============");
			System.out.println();
			
			val.notImp();
			System.out.printf("%-21s%s%-21s%s%-22s%s%-14s", "Player1","| ","Player2","| ","Player3","| ","Player4");
			System.out.print("|");
			System.out.println();
			
			System.out.printf("%-21s%s%-21s%s%-22s%s%-14s",Player1.playerValue(p1),"| ",Player2.playerValue(p2),"| ",Player3.playerValue(p3),"| ",Player4.playerValue(p4));
			System.out.print('|');
			System.out.println();
			val.notImp();
			System.out.println();
			
			val.notImp();
			System.out.printf("%6s%9s%41s%29s","Totals","|","Against","|");
			System.out.println();
			val.notImp();
			
			res.result(p1, p2, p3, p4);
			val.notImp();
		}
		
		((ClassPathXmlApplicationContext) context).close();
		



	}

}
