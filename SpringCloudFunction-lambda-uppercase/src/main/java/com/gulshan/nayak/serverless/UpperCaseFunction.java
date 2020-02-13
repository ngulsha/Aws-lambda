package com.gulshan.nayak.serverless;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class UpperCaseFunction implements Function<String, String>{

	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}

}
