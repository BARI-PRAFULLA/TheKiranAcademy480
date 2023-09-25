package com.tka.encapsulation;
import java.util.Scanner;
public class Demo {
	      private int Did;
	      private String Dnm;
	      

	public int getDid() {
			return Did;
		}


		public void setDid(int did) {
			Did = did;
		}


		public String getDnm() {
			return Dnm;
		}


		public void setDnm(String dnm) {
			Dnm = dnm;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		d.setDid(sc.nextInt());
		System.out.println("Enter the nm");
		d.setDnm(sc.next());
		
		System.out.println(d.getDid());
		System.out.println(d.getDnm());
	
	}

}
