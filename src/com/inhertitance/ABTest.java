package com.inhertitance;

public class ABTest {
	
	void m1() {
		int a=Integer.MAX_VALUE;
		long l=Long.MAX_VALUE;
		
		a=(int)l;
		System.out.println(a);
	}
	
	public static void main(String args[]){
		
	/*	B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.c);
		
		b.m1();
		b.m2();
		b.m3();
		*/
		int a=90;
		long l=100;
		l=a;
		System.out.println(l);
		
	/*	A a=new B();
		System.out.println(a.a);
		System.out.println(a.b);
		//System.out.println(a.c);
		
		a.m1();
		a.m2();
		//a.m();
		
		/*********** Variables and methods of superclass are called and for common methods,
		  subclass methods are called**************/
		
		
	
	}
	

}
