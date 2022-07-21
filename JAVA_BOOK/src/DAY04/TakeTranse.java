package DAY04;

public class TakeTranse {

	public static void main(String[] args) {

		Student studentJames =new Student("James: ",5000);
		Student studentTomas =new Student("Tomas: ",5000);
		
		Bus bus100 =new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxiCharge = new Taxi(2.5);
		studentJames.takeTaxi(taxiCharge);
		studentJames.showInfo();
		taxiCharge.showInfo();
				
		
		
	}

}
