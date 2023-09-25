package com.ControlStatments_loops;
import java.util.Scanner;
public class pro2 {
	static Scanner sc=new Scanner(System.in);
	int no;
void getData()
{
   System.out.println("Enter a no");
     no=sc.nextInt();
}
void calc()
{
   int sum=0;
   for(int i=1;i<=no;i++)
   {
	   sum=sum+no;
   }
   
   System.out.println("sum="+sum);
}

public static void main(String[] args) {
// TODO Auto-generated method stub

pro2 p2=new pro2();
p2.getData();
p2.calc();
}

}


