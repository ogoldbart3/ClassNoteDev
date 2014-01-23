package com.rumbleworks.classnotepractice;

import java.util.ArrayList;

public class Course {

	String courseName;
	String courseSchool;
	int courseNumber;
	
	ArrayList<GradedWork> gradedWorkList;
	ArrayList<Announcement> announcementList;
	
	public Course( String courseName, String courseSchool, int courseNumber ) {
		this.courseName = courseName;
		this.courseSchool = courseSchool;
		this.courseNumber = courseNumber;
		
		this.gradedWorkList = new ArrayList<GradedWork>();
		this.announcementList = new ArrayList<Announcement>();
		
	}
	
}
