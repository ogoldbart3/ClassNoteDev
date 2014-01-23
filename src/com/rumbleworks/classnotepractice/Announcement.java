package com.rumbleworks.classnotepractice;

import java.util.Date;

public class Announcement implements DataItem {

	public String name;
	public String description;
	public Boolean isRead;
	public Date dueDate;
	public int courseNumber;
	
	public Announcement( String name, String description, Boolean isRead, Date dueDate, int courseNumber ) {
		this.name = name;
		this.description = description;
		this.isRead = isRead;
		this.dueDate = dueDate;
		this.courseNumber = courseNumber;
	
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public Boolean getIsRead() {
		// TODO Auto-generated method stub
		return isRead;
	}

	@Override
	public Date getDueDate() {
		// TODO Auto-generated method stub
		return dueDate;
	}
	
	@Override
	public int getCourseNumber() {
		// TODO Auto-generated method stub
		return courseNumber;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	@Override
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

}
