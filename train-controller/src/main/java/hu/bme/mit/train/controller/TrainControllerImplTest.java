package hu.bme.mit.train.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;
import hu.bme.mit.train.interfaces.TrainController;


public class TrainControllerImplTest {

	TrainControllerImpl TestImpl  = new TrainControllerImpl();

	@Test
	public void testSpeedLimit() {

	Assert.assertEquals(0,TestImpl.getReferenceSpeed());
	}

}