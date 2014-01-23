package com.rumbleworks.classnotepractice;

import java.util.Date;

public class GradedWork implements DataItem {

	public String name;
	public String description;
	public Boolean isRead;
	public Date dueDate;
	public int courseNumber;
	
	public double pointsEarned;
	public double pointsPossible;
	public double overallScore;
	public double percentageOfFinal;
	
	public GradedWork( String name, String description, Boolean isRead, Date dueDate, int courseNumber, double pointsEarned, double pointsPossible, double overallScore, double percentageOfFinal ) {
		this.name = name;
		this.description = description;
		this.isRead = isRead;
		this.dueDate = dueDate;
		this.courseNumber = courseNumber;
		this.pointsEarned = pointsEarned;
		this.pointsPossible = pointsPossible;
		this.overallScore = overallScore;
		this.percentageOfFinal = percentageOfFinal;
	
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

	
	
	public double getPointsEarned() {
		// TODO Auto-generated method stub
		return pointsEarned;
	}

	public double getPointsPossible() {
		// TODO Auto-generated method stub
		return pointsPossible;
	}

	public double getOverallScore() {
		// TODO Auto-generated method stub
		return overallScore;
	}

	public double getPercentageOfFinal() {
		// TODO Auto-generated method stub
		return percentageOfFinal;
	}

	public void setPointsEarned(double pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public void setPointsPossible(double pointsPossible) {
		this.pointsPossible = pointsPossible;
	}

	public void setOverallScore(double overallScore) {
		this.overallScore = overallScore;
	}

	public void setPercentageOfFinal(double percentageOfFinal) {
		this.percentageOfFinal = percentageOfFinal;
	}
}
