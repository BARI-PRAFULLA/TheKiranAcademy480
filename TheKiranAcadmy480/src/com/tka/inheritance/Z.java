package com.tka.inheritance;
//Multilevel Inheritance
public class Z extends Y{
	public void methodZ()
	{
		System.out.println("Class Z method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z=new Z();
		z.methodX();// calling grand parent class method
		z.methodY();// calling parent class method
		z.methodZ();// calling local method
				

	}

}
