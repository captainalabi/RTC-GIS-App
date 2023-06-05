package com.alabi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alabi.app.entity.Rtc;

@Repository
public interface RtcRepository extends JpaRepository<Rtc, Integer>{

}
