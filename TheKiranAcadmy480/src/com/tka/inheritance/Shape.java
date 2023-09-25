package com.tka.inheritance;

public class Shape {
         protected int sides;
         
		public Shape()
         {
        	 sides=3;
        	 
         }
		public int getSide() {
			return sides;
}
		public void printSide()
		{
			System.out.println("This object has "+sides+" sides.");
		}
}