package com.arithematic.calculator;
import java.util.Scanner;

public class ArithematicCalculator {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
		System.out.println("enter the numbers for arithematic calculations");
		
		int number1=a.nextInt();
	    int number2=b.nextInt();
	    System.out.println("The first no entered is"+number1);
	    System.out.println("The second no entered is"+number2);
	    
	    ArithematicCalculator calc=new ArithematicCalculator();
	    
	    int additionresult=calc.addition(number1,number2);
	    int substractionresult=calc.substraction(number1,number2);
	    int multiplicationresult=calc.multiplication(number1,number2);
	    int divisionresult=calc.division(number1,number2);
	
	    System.out.println("Arithematic operation results are");
	System.out.println(number1 + "+" + number2 + "=" + (additionresult));
	System.out.println(number1 + "-" + number2 + "=" + (substractionresult));   
	System.out.println(number1 + "*" + number2 + "=" + (multiplicationresult));    
	System.out.println(number1 + "/" + number2 + "=" + (divisionresult));
	}
		
	public int addition(int a, int b) {
		
		return a+b;
	}
		
public int substraction(int a ,int b) {
		
		return a-b;
	}

public int multiplication(int a ,int b) {
	
	return a*b;
}
public int division(int a ,int b) {
	
	return a/b;
}
	}
