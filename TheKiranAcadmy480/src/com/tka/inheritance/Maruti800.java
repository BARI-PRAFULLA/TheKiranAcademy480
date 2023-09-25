package com.tka.inheritance;

public class Maruti800 extends Maruti
	{
		public Maruti800()
		{
			System.out.println("Class Maruti800 Constructor");
		}
		public void speed()
		{
			super.speed();
			System.out.println("Maxx speed : 80kmph");
		}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
     Maruti800 obj=new Maruti800();
    obj.vehicleType();
     obj.brand();
     obj.speed();
}}