package com.demo1;

public class PolymorphismOverload {
	public static void main(String args[]) {
		Overloadclass p=new Overloadclass();
		p.sub();
		System.out.println(p.sub(2));
		System.out.println(p.sub(3,2));
	}
}

class Overloadclass
{
	public void sub() {
		System.out.println("Subtraction");
	}
	
	public int sub(int a) {
		return a;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
}