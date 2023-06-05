package com.alabi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.alabi.app.entity.Rtc;
import com.alabi.app.repository.RtcRepository;
import com.alabi.app.utility.CurrentDateAndTime;

@Service
public class RtcServiceImpl implements RtcService{

	private RtcRepository rtcRepository;
	
	@Autowired	
	public RtcServiceImpl(RtcRepository rtcRepository) {
		super();
		this.rtcRepository = rtcRepository;
	}

	/*
	 * saves rtc record to db
	 * @Param(rtc object)
	 */
	@Override
	public Rtc create(Rtc rtc) {
		
		rtc.setDate(CurrentDateAndTime.todaysDate());
		rtc.setTime(CurrentDateAndTime.time());
		
		return rtcRepository.save(rtc);
	}

	/*
	 * fetches all rtc record from db
	 */
	@Override
	public List<Rtc> read() {

		return rtcRepository.findAll();
	}

	/*
	 * updates an rtc record in db
	 */
	@Override
	public Rtc update(Rtc rtc) {
		// TODO Auto-generated method stub
		return rtcRepository.save(rtc);
	}

	/*
	 * deletes an rtc record from db
	 */
	@Override
	public void deleteById(Integer id) {
		
		rtcRepository.deleteById(id);
	}	
	
	public Rtc searchById(Integer id) {
		
		return rtcRepository.findById(id).get();
	}
}
