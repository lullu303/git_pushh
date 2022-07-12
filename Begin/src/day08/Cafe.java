package day08;

import day07.Superman;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm=new CoffeeMachine();
		//밀크 커피 만들기
		
		System.out.println("밀크커피");
		//System.out.println(cm.makeTea(10,5,9)); //string
		//System.out.println();
		
		String s=cm.makeTea(1, 2, 3);
		System.out.println(s);
		
		//설탕 커피 만들기
		System.out.println("설탕커피");
		cm.makeTea(10,4); //void
		System.out.println();
		
		//블랙 커피 만들기
		System.out.println("블랙커피");
		cm.makeTea(1); //int
		System.out.println();
		
		System.out.println("크림커피");
		cm.makeTea((short)1,3); //강제형변환.
		System.out.println();
		
		//유자차 만들기
		System.out.println("유자차");
		Yuja yj=new Yuja();    
		//cm.makeTea(yj);
		//yj.Yuja=3 [x]
		yj.setYuja(3);
		yj.setSugar(3);
		cm.makeTea(yj);

	}

}
