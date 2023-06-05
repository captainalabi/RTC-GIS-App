package com.alabi.app.entity;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Rtc {

	//----------------User Data
		private String rescuerName;
		private String email;	
			
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;

		//----------------RTC Data
		private String command;
		private String date;
		private String time;
		private String route;
		private String location;
		private String typeOfRTC;
		private int totalPeopleInvolved;
		private int totalPeopleIjured;
		private int totalPeopleKilled;
		private int totalPeopleRescued;
		private int totalVehicles;
		private String vehicleDetails;	
		private String probableCause;
		private int totalCashRecovered;
		
		public Rtc() {
			super();
		}

		

		public Rtc(String rescuerName, String email, Integer id, String command, String date, String time, String route,
				String location, String typeOfRTC, int totalPeopleInvolved, int totalPeopleIjured,
				int totalPeopleKilled, int totalPeopleRescued, int totalVehicles, String vehicleDetails,
				String probableCause, int totalCashRecovered) {
			super();
			this.rescuerName = rescuerName;
			this.email = email;
			this.id = id;
			this.command = command;
			this.date = date;
			this.time = time;
			this.route = route;
			this.location = location;
			this.typeOfRTC = typeOfRTC;
			this.totalPeopleInvolved = totalPeopleInvolved;
			this.totalPeopleIjured = totalPeopleIjured;
			this.totalPeopleKilled = totalPeopleKilled;
			this.totalPeopleRescued = totalPeopleRescued;
			this.totalVehicles = totalVehicles;
			this.vehicleDetails = vehicleDetails;
			this.probableCause = probableCause;
			this.totalCashRecovered = totalCashRecovered;
		}

		public String getCommand() {
			return command;
		}

		public void setCommand(String command) {
			this.command = command;
		}



		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getRescuerName() {
			return rescuerName;
		}

		public void setRescuerName(String rescuerName) {
			this.rescuerName = rescuerName;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getRoute() {
			return route;
		}

		public void setRoute(String route) {
			this.route = route;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getTypeOfRTC() {
			return typeOfRTC;
		}

		public void setTypeOfRTC(String typeOfRTC) {
			this.typeOfRTC = typeOfRTC;
		}

		public int getTotalPeopleInvolved() {
			return totalPeopleInvolved;
		}

		public void setTotalPeopleInvolved(int totalPeopleInvolved) {
			this.totalPeopleInvolved = totalPeopleInvolved;
		}

		public int getTotalPeopleIjured() {
			return totalPeopleIjured;
		}

		public void setTotalPeopleIjured(int totalPeopleIjured) {
			this.totalPeopleIjured = totalPeopleIjured;
		}

		public int getTotalPeopleKilled() {
			return totalPeopleKilled;
		}

		public void setTotalPeopleKilled(int totalPeopleKilled) {
			this.totalPeopleKilled = totalPeopleKilled;
		}

		public int getTotalPeopleRescued() {
			return totalPeopleRescued;
		}

		public void setTotalPeopleRescued(int totalPeopleRescued) {
			this.totalPeopleRescued = totalPeopleRescued;
		}

		public int getTotalVehicles() {
			return totalVehicles;
		}

		public void setTotalVehicles(int totalVehicles) {
			this.totalVehicles = totalVehicles;
		}

		public String getVehicleDetails() {
			return vehicleDetails;
		}

		public void setVehicleDetails(String vehicleDetails) {
			this.vehicleDetails = vehicleDetails;
		}

		public String getProbableCause() {
			return probableCause;
		}

		public void setProbableCause(String probableCause) {
			this.probableCause = probableCause;
		}

		public int getTotalCashRecovered() {
			return totalCashRecovered;
		}

		public void setTotalCashRecovered(int totalCashRecovered) {
			this.totalCashRecovered = totalCashRecovered;
		}

		@Override
		public String toString() {
			return "Rtc [rescuerName=" + rescuerName + ", email=" + email + ", id=" + id + ", date=" + date + ", time="
					+ time + ", route=" + route + ", location=" + location + ", typeOfRTC=" + typeOfRTC
					+ ", totalPeopleInvolved=" + totalPeopleInvolved + ", totalPeopleIjured=" + totalPeopleIjured
					+ ", totalPeopleKilled=" + totalPeopleKilled + ", totalPeopleRescued=" + totalPeopleRescued
					+ ", totalVehicles=" + totalVehicles + ", vehicleDetails=" + vehicleDetails + ", probableCause="
					+ probableCause + ", totalCashRecovered=" + totalCashRecovered + "]";
		}
		
		/*
		 * Ensure no null values
		 */
		public static boolean isValidRtc(Rtc rtc) {
		    return rtc != null && StringUtils.isNotBlank(rtc.command) 
		      && StringUtils.isNotBlank(rtc.getDate())
		      && StringUtils.isNotBlank(rtc.getTime())
		      && StringUtils.isNotBlank(rtc.getEmail())
		      && StringUtils.isNotBlank(rtc.getLocation())
		      && StringUtils.isNotBlank(rtc.getProbableCause())
		      && StringUtils.isNotBlank(rtc.getRescuerName())
		      && StringUtils.isNotBlank(rtc.getRoute())
		      && StringUtils.isNotBlank(rtc.getTypeOfRTC())
		      && StringUtils.isNotBlank(rtc.getVehicleDetails())
		      && StringUtils.isNotBlank(Integer.valueOf(rtc.getTotalPeopleRescued()).toString())
		      && StringUtils.isNotBlank(Integer.valueOf(rtc.getTotalVehicles()).toString());
		}
}
