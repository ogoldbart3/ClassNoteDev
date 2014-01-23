package com.rumbleworks.classnotepractice;

import java.util.Date;

public class Assignment extends GradedWork {

	public Assignment( String name, String description, Boolean isRead, Date dueDate, int courseNumber, double pointsEarned, double pointsPossible, double overallScore, double percentageOfFinal ) {
		super( name, description, isRead, dueDate, courseNumber, pointsEarned, pointsPossible, overallScore, percentageOfFinal );
	}
	
}
