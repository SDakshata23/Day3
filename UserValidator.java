package com.demo1;

import java.util.Scanner;

public class UserValidator {
	public static void main(String args[])throws NameValidator {
		Scanner in=new Scanner(System.in);
		String name=in.nextLine().toUpperCase();
		char ch[]=name.toCharArray();
		for(char x:ch) {
			if('A'<=x  && 'Z'>=x) {
				System.out.println("Validation Successful");
			}
			else if('0'<=x && '9'>=x) {
				throw new NameValidator("number");
				
			}
			else {
				throw new NameValidator("Symbol");
				
			}
		}
		in.close();
	}
	
}

class NameValidator extends Exception {
	
	NameValidator(String str){
		super(str);
}
}


