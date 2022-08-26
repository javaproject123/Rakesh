package com.java;
import java.util.*;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a,b and c=");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		float d;
		d=(float)Math.sqrt(a*a)-4*a*c;
		if(d>0) {
			System.out.print("both roots are real and differnd");
		}
		else if (d==0) {
			System.out.print("both roots are real and same");
		}
		else {
			System.out.print("both roots are distinct and imaginary");
			
		}
		

	}

}
