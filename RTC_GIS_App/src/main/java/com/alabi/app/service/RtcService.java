package com.alabi.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alabi.app.entity.Rtc;

public interface RtcService {

	Rtc create(Rtc rtc);
	
	List<Rtc> read();
	
	Rtc update(Rtc rtc);
	
	void deleteById(Integer id);
	
	Rtc searchById(Integer id);
}
