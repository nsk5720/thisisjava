package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare();	X
		//Bus bus = new Bus();	O
		//bus.checkFare();		O
		//bus.run()				O
		Bus bus = (Bus) vehicle;  //강제 타입 변환
		bus.run();
		bus.checkFare();
	}

}
