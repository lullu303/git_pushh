package DAY02;

public class SwitchCase2 {

	public static void main(String[] args) {
		String medal ="Gold";
		
		switch(medal) {
		case "Gold" :
			System.out.println("축하합니다. 금메달 입니다");
			break;
			
		case "Silver" : 
			System.out.println("축하합니다 은메달 입니다");
			break;
		
		case "Bronze" :
			System.out.println("축하합니다 동메달 입니다");
			break;
		default:
			System.out.println("메달이 없습니다");
			break;
		
		}
		
		
		
		
	}

}