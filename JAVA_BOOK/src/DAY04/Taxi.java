package DAY04;

public class Taxi {

	double kilomiter;
	int timeCount;
	int money;
	
	public Taxi(double kilomiter) {
		this.kilomiter=kilomiter;
	}
	
	public void take (int money) {
		this.money +=money;
		timeCount++;
	}
	
	public void showInfo() {
		System.out.println("택시 요금은"+kilomiter+"km의 거리와 "+timeCount+"시간을 반영하여 계산되고, 요금은 "+money+"입니다.");
	}
	
	
	
}
