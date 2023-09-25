package com.tka.basic;

public class Rectangle {
	double W ,l;
	//w=width,l=length
	void Area()
	{
	 	W=15.34;
		l=36.65;
		double area=W*l;
		System.out.println("Area="+area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Rectangle r=new Rectangle();
          r.Area();
	}

}
