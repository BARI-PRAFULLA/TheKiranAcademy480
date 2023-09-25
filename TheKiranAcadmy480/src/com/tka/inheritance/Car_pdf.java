package com.tka.inheritance;

public class Car_pdf extends Vehicle {
	String modalType;
	public void showDetail() {
		String vehicleType = "car";
		String modelType = "sports";
		System.out.println(modelType + " " + vehicleType);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_pdf cp=new Car_pdf();
		cp.showDetail();
	}

}
