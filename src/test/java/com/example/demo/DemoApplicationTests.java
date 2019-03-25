package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
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
	public void testFindAllLogins() {
		List<PoliceLogin> login = policeRepository.getAllPoliceLogins();
		Assert.assertEquals("the number of logins must be 4", 4, login.size());
	}

	@Test
	public void testFindAllSuspicions() {
		List<Suspicions> suspicion = suspicionRepository.getAllSuspicions();
		Assert.assertEquals("the number of suspicions must be 6", 6, suspicion.size());
	}

	@Test
	public void testSaveSuspicion(){
		List<Suspicions> suspicions = suspicionRepository.getAllSuspicions();
		Assert.assertEquals("the number of suspicions must be 6", 6, suspicions.size());

		Suspicions suspicion = new Suspicions("Person", "Irregular behavior", null, "This is a test to see if we can add tips in the database", null);
		suspicionRepository.saveSuspicion(suspicion);
		List<Suspicions> newList = suspicionRepository.getAllSuspicions();

		Assert.assertEquals("the number of suspicions must be 7", 7, newList.size());

	}

	@Test
	public void testFindAllLocations() {
		List<DateAndLocation> locations = dateAndLocationRepository.getAllLocations();
		Assert.assertEquals("the number of suspicions must be 6", 6, locations.size());
	}

	@Test
	public void testSaveDateAndLocation(){
		List<DateAndLocation> locations = dateAndLocationRepository.getAllLocations();
		Assert.assertEquals("the number of suspicions must be 6", 6, locations.size());

		DateAndLocation dateAndLocation = new DateAndLocation(4, (float)63.821175, (float)20.279367, "22/03/2019", "22:37");
		dateAndLocationRepository.saveSuspicion(dateAndLocation);
		List<DateAndLocation> newList = dateAndLocationRepository.getAllLocations();

		Assert.assertEquals("the number of suspicions must be 7", 7, newList.size());

	}

}
