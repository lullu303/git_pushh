package DAY02;

public class SwitchCase3 {

	public static void main(String[] args) {
		int floor= 4;
		String floorname;
		
		switch(floor) {
		case 1 : floorname="1층은 약국";
				break;
		case 2: floorname="2층은 정형외과";
				break;
		case 3: floorname="3층은 피부과";
				break;
		case 4: floorname="4층은 치과";
				break;
		case 5: floorname="5층은 헬스클럽";
				break;
				
		default: floorname="존재하지 않는 층";
		}
		System.out.println(floorname+"입니다");
		
		
	}

}
