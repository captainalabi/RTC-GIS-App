package com.alabi.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alabi.app.entity.Rtc;
import com.alabi.app.repository.RtcRepository;
import com.alabi.app.service.RtcService;
import com.alabi.app.utility.CurrentDateAndTime;

@SpringBootApplication
public class RtcGisAppApplication implements CommandLineRunner{

	@Autowired
	private RtcService rtcService;
	
	
	public RtcGisAppApplication(RtcService rtcService) {
		super();
		this.rtcService = rtcService;
	}

	public static void main(String[] args) {
		SpringApplication.run(RtcGisAppApplication.class, args);
	}

	@Override
public void run(String... args) throws Exception {
		
		//System.out.println("date now ::::::::::::::::::" + CurrentDateAndTime.time());
	
//		Rtc rtc = new Rtc();
	
//	rtc.setRescuerName("Olowo 2");
//	rtc.setEmail("olowo@gmail.com");
//   rtc.setLocation("Abuja");
//	rtc.setProbableCause("Speed");
//	rtc.setRoute("Iponrin-Owo");
//	//rtc.setDate("22-12-1990");
//	//rtc.setTime("12:08");
//	rtc.setTotalCashRecovered(5000000);
//	rtc.setTotalPeopleIjured(3);
//	rtc.setTotalPeopleInvolved(50);
//	rtc.setTotalPeopleKilled(0);
//	rtc.setTotalPeopleRescued(47);
//	rtc.setTotalVehicles(2);
//	rtc.setTypeOfRTC("Fatal");
//	rtc.setVehicleDetails("Details");
//	
//	rtcService.create(rtc);
	//System.out.println("found:::::::::::::::::::: ?");
		
//		List<Rtc> allRtc = rtcService.read();
//		for(Rtc rtc:allRtc) {
//			System.out.println(rtc.toString());
//		}
		
		//rtcService.deleteById(552);
//		Rtc rtc = rtcService.searchById(702);
//		System.out.println(rtc.toString());
	}
}
