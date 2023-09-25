package com.tka.inheritance;

public class mainCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Car2 b1=new Car2();
            b1.color ="red";
            b1.setSpeed(150);
            b1.setSize(22);
            b1.setCc(1000);
            b1.gears=5;
            
            System.out.println("Color of Car :"+b1.color);
            System.out.println("Speed of car :"+b1.getSpeed());
            System.out.println("Size of Car :"+b1.getSize());
            System.out.println("CC of Car :"+b1.getCc());
            System.out.println("No of Gear :"+b1.gears);
        
	}

}
