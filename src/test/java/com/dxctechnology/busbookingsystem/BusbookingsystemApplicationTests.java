package com.dxctechnology.busbookingsystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dxctechnology.busbookingsystem.dao.BusDAO;
import com.dxctechnology.busbookingsystem.entity.Bus;

@SpringBootTest
class BusbookingsystemApplicationTests {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	@Autowired
	private BusDAO impl;
	
	@Test
	public void getAllBuses() {
		LOGGER.info("allBusDetails method invoked");
		List<Bus> buses = impl.findAll();
		assertThat(buses).size().isGreaterThan(0);
	}

}
