package com.mycompany.kata;


public class FizzBuzz {

	public String say(String number) {
		if(Integer.parseInt(number) % 3 == 0)
			return "Fizz";
		if("5".equals(number))
			return "Buzz";

		return number;
	}

}
