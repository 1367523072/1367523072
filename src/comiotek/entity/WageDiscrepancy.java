package comiotek.entity;

import java.util.Date;

//π§◊ “Ï“È
public class WageDiscrepancy {
	private int id;
	private int eId;
	private String reason;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public WageDiscrepancy() {
		super();
	}
	public WageDiscrepancy(int id, int eId, String reason, Date date) {
		super();
		this.id = id;
		this.eId = eId;
		this.reason = reason;
		this.date = date;
	}
	@Override
	public String toString() {
		return "WageDiscrepancy [id=" + id + ", eId=" + eId + ", reason=" + reason + ", date=" + date + "]";
	}
}
