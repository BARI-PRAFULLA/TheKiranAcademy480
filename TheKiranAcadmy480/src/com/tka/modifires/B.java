package com.tka.modifires;
import com.tka.Access_specifiers.A;
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa = new A();
		aa.m1();// error private
		aa.m2();// error default outside of package
		aa.m3();// error protected only in subclass
		aa.m4();// public everywhere
	}

}
