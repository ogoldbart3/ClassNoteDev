package com.rumbleworks.classnotepractice;

import java.util.Date;

public interface DataItem {

	public String getName();
	public String getDescription();
	public Boolean getIsRead();
	public Date getDueDate();
	public int getCourseNumber();
	
	public void setName( String name );
	public void setDescription( String description );
	public void setIsRead( Boolean isRead );
	public void setDueDate( Date dueDate );
	public void setCourseNumber( int courseNumber );
}
