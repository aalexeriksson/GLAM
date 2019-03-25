package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	PoliceLoginRepository policeRepository;

	@Autowired
	SuspicionRepository suspicionRepository;

	@Autowired
	DateAndLocationRepository dateAndLocationRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindAllEvents() {
		List<PoliceLogin> login = policeRepository.getAllPoliceLogins();
		Assert.assertEquals("the number of logins must be 4", 4, login.size());
	}

	@Test
	public void testFindAllSuspicions() {
		List<Suspicions> login = suspicionRepository.getAllSuspicions();
		Assert.assertEquals("the number of suspicions must be 6", 6, login.size());
	}

	@Test
	public void testFindAllLocations() {
		List<DateAndLocation> locations = dateAndLocationRepository.getAllLocations();
		Assert.assertEquals("the number of suspicions must be 6", 6, locations.size());
	}

}
