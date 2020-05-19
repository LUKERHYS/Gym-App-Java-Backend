package com.lukemelvin.GymApp;

import com.lukemelvin.GymApp.enums.Goal;
import com.lukemelvin.GymApp.models.Session;
import com.lukemelvin.GymApp.repositories.MemberRepository;
import com.lukemelvin.GymApp.repositories.SessionRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class GymAppApplicationTests {

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	SessionRepository sessionRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetSessionByType(){
		List<Session> foundSessions = sessionRepository.findByType(Goal.STRENGTH);
		assertEquals(1, foundSessions.size());
	}

//	@Test
//	public void canGetMembersInASession(){
//		List<Customer> foundCustomers = customerRepository.findAllByBookingsCourseId(1L);
//		assertEquals(2, foundCustomers.size());
//		assertEquals("Luke", foundCustomers.get(0).getName());
//	}
//
//	@Test
//	public void canGetCoursesByCustomer(){
//		List<Course> foundCourses = courseRepository.findAllByBookingsCustomerId(2L);
//		assertEquals(1, foundCourses.size());
//		assertEquals("Ruby", foundCourses.get(0).getName());
//	}
//
//	@Test
//	public void canGetCoursesByDate(){
//		List<Booking> foudnBookings = bookingRepository.findByDate("13-03-2017");
//		assertEquals(2, foudnBookings.size());
//	}


}