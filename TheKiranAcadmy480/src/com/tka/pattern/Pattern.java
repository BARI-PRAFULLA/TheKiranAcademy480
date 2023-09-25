package com.tka.pattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i,j,row1=6;
	
	for(i=0;i<row1;i++)
	{
		for(j=2*(row1-i);j>=0;j--)
		{
		System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
	}
		System.out.println();
}
	}}		
