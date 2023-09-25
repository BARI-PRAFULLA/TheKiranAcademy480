package com.tka.basic;
import java.util.Scanner;
public class Percentage {
	 
    void marks(double Math, double Eng, double Hindi)
    {
    	
    	double a=(Math+Eng+Hindi)*100/300;
    	System.out.println("marks="+a);
    	
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage p=new Percentage();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Math Percentage");
         double Math=sc.nextDouble();
         System.out.println("Enter Eng Percentage");
         double Eng=sc.nextDouble();
         System.out.println("Enter Hindi Percentage");
         double Hindi=sc.nextDouble();
          p.marks(Math,Eng,Hindi);
          sc.close();
	}

}
