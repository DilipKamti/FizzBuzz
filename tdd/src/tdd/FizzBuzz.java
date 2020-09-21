package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzz {

	@Test
	public void NormalNumber() {
		FizzBuzzconverter c= new FizzBuzzconverter();
		
		Assert.assertEquals("1",c.convert(1));
		Assert.assertEquals("2",c.convert(2));
	}
	
	@Test
	public void MultipleOfThree() {
		FizzBuzzconverter c= new FizzBuzzconverter();	
		Assert.assertEquals("Fizz",c.convert(3));
	}
	
	

}
