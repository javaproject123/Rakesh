package com.java;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=0;
        int num=0;
        String primenumbers =" ";
        for(i=15;i<=30;i++) {
        	int counter=0;
        	for(num=1;num>=1;num--) {
        	if (i%num==0)
        		counter=counter+1;
        	}
        }if(counter=2) {
        	primenumbers=primenumbers+i+" ";
        }
	}   System.out.println("primenumbers from 15 to 30 are :");
	    System.out.println("primenumbers");

}
