package com.mycompany.kata;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;


public class FizzBuzzTest {
	FizzBuzz cut = new FizzBuzz();

	@Test
	public void givenOneWhenCallFizzbuzzThenOneShouldBeReturned() throws Exception {
		assertThat(cut.say("1"), CoreMatchers.is("1"));
	}

	@Test
	public void givenTwoWhenCallFizzbuzzThenTwoShouldBeReturned() throws Exception {
		assertThat(cut.say("2"), CoreMatchers.is("2"));
	}

	@Test
	public void givenThreeWhenCallFizzbuzzThenFizzShouldBeReturned() throws Exception {
		assertThat(cut.say("3"), CoreMatchers.is("Fizz"));
	}

	@Test
	public void givenFiveWhenCallFizzbuzzThenBuzzShouldBeReturned() throws Exception {
		assertThat(cut.say("5"), CoreMatchers.is("Buzz"));
	}

	@Test
	public void givenSixWhenCallFizzbuzzThenFizzShouldBeReturned() throws Exception {
		assertThat(cut.say("6"), CoreMatchers.is("Fizz"));
	}
}
