package com.lioigor22.model;


import static org.junit.Assert.*;
import org.junit.Test;

import com.lioigor22.planes.Chassis;
import com.lioigor22.planes.WrongChassisRadiusException;

public class ChassisTest {

	@Test
	public void testThrowWrongChassisRadiusException() {
		
		try{
			Chassis ch = new Chassis(17.9);
			fail("Not throw exception in constructor!");
			
		}catch (WrongChassisRadiusException ex) {
			assertTrue(true);
		}

	}
	
}
