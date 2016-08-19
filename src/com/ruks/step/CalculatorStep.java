package com.ruks.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import junit.framework.Assert;

import com.ruks.core.Calculator;

public class CalculatorStep {
	private Calculator myCal;
	
	@Given("a calculator")
	public void setCal() {
		myCal=new Calculator();
		System.out.println("Created");
	}
	
	
	@When("I add $number1 and $number2")
	public void AddCal(int x,int y) {
		myCal.addTwoNumber(x, y);
	}

	@Then("the outcome should $result")
	public void testResult(int output) {
		 Assert.assertEquals(output, myCal.getresult());
	}
	
	@Given("a calculator2")
	public void setCal1() {
		myCal=new Calculator();
		System.out.println("Created");
	}
	
	@When("I minus $number1 by $number2")
	public void MinCal(int x, int y){
		myCal.minusTwoNumber(x, y);		
	}
	
	@Then("the outcome should $result")
	public void testResult2(int output){
		Assert.assertEquals(output, myCal.getresult());
	}
}
