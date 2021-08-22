package IMS;

import java.util.ArrayList;

//import Implementation.CarDetail;

public class CarDetailList {
	
	public static ArrayList<CarDetail> CarDetail() {
		
		ArrayList<CarDetail> carDetailList = new ArrayList<CarDetail>();
		CarDetail c1 = new CarDetail(1234, "XF", "Jaguar", 25, 150000);
		CarDetail c2 = new CarDetail(3965, "750", "BMW", 30, 103000);
		CarDetail c3 = new CarDetail(4322, "Taycan", "Porsche", 35, 105000);
		CarDetail c4 = new CarDetail(3424, "S90", "Volvo", 25, 52000);
		CarDetail c5 = new CarDetail(8439, "A6", "Audi", 26, 55000);
		
		carDetailList.add(c1);
		carDetailList.add(c2);
		carDetailList.add(c3);
		carDetailList.add(c4);
		carDetailList.add(c5);
		return carDetailList;
	}
}
