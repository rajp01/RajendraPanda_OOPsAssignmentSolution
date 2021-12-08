package com.greatlearning.model;

public class SuperDepartment {
	// Declare departmentName,getTodaysWork,getWorkDeadline,isTodayAHoliday
		private String departmentName;
		private String getTodaysWork;
		private String getWorkDeadline;
		private String isTodayAHoliday;
		
		// Create a constructor
		public SuperDepartment(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday) {
			this.setDepartmentName(departmentName);
			this.setGetTodaysWork(getTodaysWork);
			this.setGetWorkDeadline(getWorkDeadline);
			this.setIsTodayAHoliday(isTodayAHoliday);
			
		}

		public String departmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
			System.out.println ("Department Name: " +"Super Department");
		}

		public String getgetTodaysWork() {
			return getTodaysWork;
			
		}

		public void setGetTodaysWork(String getTodaysWork) {
			this.getTodaysWork = getTodaysWork;
			System.out.println ("Todays Work: " +"No Work of now");
		}

		public String getgetWorkDeadline() {
			return getWorkDeadline;
		}

		public void setGetWorkDeadline(String getWorkDeadline) {
			this.getWorkDeadline = getWorkDeadline;
			System.out.println ("Work Deadline: " +"Nil");
		}

		public String getisTodayAHoliday() {
			return isTodayAHoliday;
		}

		public void setIsTodayAHoliday(String isTodayAHoliday) {
			this.isTodayAHoliday = isTodayAHoliday;
			System.out.println ("Is Today a Holiday: " +"Today is not a Holiday");
		}
		
		
		// Create getters and setters
		
		public void display()
		{
		System.out.println ("Welcome to" +departmentName);
		System.out.println (getTodaysWork);
		System.out.println (getWorkDeadline);
		System.out.println (isTodayAHoliday);
		}

		
}
