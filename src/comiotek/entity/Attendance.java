package comiotek.entity;

import java.util.Date;

public class Attendance {
	private int id;
	private String uName;
	private Date officeHours;
	private Date closingTime;
	private String late;
	private String leaveEarly;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public Date getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(Date officeHours) {
		this.officeHours = officeHours;
	}
	public Date getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(Date closingTime) {
		this.closingTime = closingTime;
	}
	public String getLate() {
		return late;
	}
	public void setLate(String late) {
		this.late = late;
	}
	public String getLeaveEarly() {
		return leaveEarly;
	}
	public void setLeaveEarly(String leaveEarly) {
		this.leaveEarly = leaveEarly;
	}
	public Attendance() {
		super();
	}
	public Attendance(int id, String uName, Date officeHours, Date closingTime, String late, String leaveEarly) {
		super();
		this.id = id;
		this.uName = uName;
		this.officeHours = officeHours;
		this.closingTime = closingTime;
		this.late = late;
		this.leaveEarly = leaveEarly;
	}
	@Override
	public String toString() {
		return "Attendance [id=" + id + ", uName=" + uName + ", officeHours=" + officeHours + ", closingTime="
				+ closingTime + ", late=" + late + ", leaveEarly=" + leaveEarly + "]";
	}
}
