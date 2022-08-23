package com.java;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int button=sc.nextInt();
    if(button == 1) {
    	System.out.println("Hello");
    }
    else if(button ==2) {
    	System.out.println("Namaste");
    }
    else if(button ==3) {
    	System.out.println("Bounjour");
    }
    else {
    	System.out.println("invalid button");
    }
	}

}
