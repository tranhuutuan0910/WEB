package com.java.be;

public class user {
      public user(String firstName, String lastName, String doB, String poB, String sex, String[] freeDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.doB = doB;
		this.poB = poB;
		this.sex = sex;
		this.freeDay = freeDay;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDoB() {
		return doB;
	}
	public void setDoB(String doB) {
		this.doB = doB;
	}
	public String getPoB() {
		return poB;
	}
	public void setPoB(String poB) {
		this.poB = poB;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getFreeDay() {
		return freeDay;
	}
	public void setFreeDay(String[] freeDay) {
		this.freeDay = freeDay;
	}
	String firstName;
      String lastName;
      String doB;
      String poB;
      String sex;
      String[] freeDay;
}
