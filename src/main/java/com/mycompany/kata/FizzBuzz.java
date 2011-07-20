package com.mycompany.kata;


public class FizzBuzz {

	public String say(String number) {
		if("3".equals(number))
			return "Fizz";
		if("5".equals(number))
			return "Buzz";

		return number;
	}

}
