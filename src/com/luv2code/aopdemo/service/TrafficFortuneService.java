package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	
	public String getFortune() {
	
		// simulate a delay
		
		try {
			
			TimeUnit.SECONDS.sleep(5);
			
		} catch (InterruptedException e) {
			
			e.getStackTrace();
		}
		
		return "Expect heavy traffic this moring";
	}

	public String getFortune(boolean tripWire) {
		
		if (tripWire) {
			throw new RuntimeException("Major accident! Highway is closed!!");
		}
		
		return "Except heavy traffic this morning";
	}
}
