package com.mycompany.kata;


public class FizzBuzz {

	public String say(String number) {
		String result = number;
		if(Integer.parseInt(number) % 3 == 0)
			result = "Fizz";
		if(Integer.parseInt(number) % 5 == 0)
			result = "Buzz";
		if((Integer.parseInt(number) % 3 == 0) && (Integer.parseInt(number) % 5 == 0))
			result = "FizzBuzz";

		return result;
	}

}
