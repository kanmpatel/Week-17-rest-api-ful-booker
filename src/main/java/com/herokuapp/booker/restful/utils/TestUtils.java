package com.herokuapp.booker.restful.utils;

import java.util.Random;

public class TestUtils {

	public String getRandomValue(){
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}
}
