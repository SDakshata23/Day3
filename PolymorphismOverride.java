package com.demo1;

public class PolymorphismOverride {
	public static void main(String a[]) {
		SingleLevel p2=new ChildLevel();
		p2.add();
	}
}

//annotation: provides information to the system @Override
class SingleLevel{
	public void add() {
		System.out.println("Parent");
	}
}


class ChildLevel extends SingleLevel{
	@Override
	public void add() {
		System.out.println("Child");
	}
}