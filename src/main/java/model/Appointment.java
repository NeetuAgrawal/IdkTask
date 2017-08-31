package model;

import java.util.Date;

public class Appointment {
	
private int id;
private int userId;
private Date appDate;
private int timeslotId;

public Appointment() {
	super();
}

public Appointment(int id, int userId, Date appDate, int timeslotId) {
	super();
	this.id = id;
	this.userId = userId;
	this.appDate = appDate;
	this.timeslotId = timeslotId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public Date getAppDate() {
	return appDate;
}

public void setAppDate(Date appDate) {
	this.appDate = appDate;
}

public int getTimeslotId() {
	return timeslotId;
}

public void setTimeslotId(int timeslotId) {
	this.timeslotId = timeslotId;
}





}
