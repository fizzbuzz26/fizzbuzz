package com.mycompany.kata;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void givenOneWhenCallFizzbuzzThenOneShouldBeReturned() throws Exception {
		FizzBuzz cut = new FizzBuzz();
		assertThat(cut.say("1"), CoreMatchers.is("1"));
	}
}
