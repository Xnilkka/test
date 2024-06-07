package com.calculadora.demo.model;

public class Numeros {
	private int num1;
	private int num2;
	private int result;
	
	public int resultdivide() {
		return num1 / num2;
	}
	
	public int getnum1() {
		return this.num1;
	}
	
	public void setnum1(int num) {
		this.num1 = num;
	}
	
	public int getnum2() {
		return this.num2;
	}
	
	public void setnum2(int num) {
		this.num2 = num;
	}
	
	public int getresult() {
		return this.result;
	}
	
	public void setresult(int num) {
		this.result = num;
	}
}
