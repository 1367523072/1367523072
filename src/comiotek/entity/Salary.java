package comiotek.entity;

import java.util.Date;

public class Salary {
	private int id;
	private int eId;
	private String eName;
	private int total;
	private int basePay;//基本工资
	private int meritPay;//绩效工资
	private int overtimeWage;//加班工资
	private int RewardsPunishmentsWages;//奖惩工资
	private int socialSecurity;//社保
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setTotal(int total) {
		this.total = total;
	}
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
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getTotal() {
		this.total = basePay+meritPay+overtimeWage+RewardsPunishmentsWages+socialSecurity;
		return total;
	}
	public int getBasePay() {
		return basePay;
	}
	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	public int getMeritPay() {
		return meritPay;
	}
	public void setMeritPay(int meritPay) {
		this.meritPay = meritPay;
	}
	public int getOvertimeWage() {
		return overtimeWage;
	}
	public void setOvertimeWage(int overtimeWage) {
		this.overtimeWage = overtimeWage;
	}
	public int getRewardsPunishmentsWages() {
		return RewardsPunishmentsWages;
	}
	public void setRewardsPunishmentsWages(int rewardsPunishmentsWages) {
		RewardsPunishmentsWages = rewardsPunishmentsWages;
	}
	public int getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(int socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	@Override
	public String toString() {
		return "Salary [id=" + id + ", eId=" + eId + ", eName=" + eName + ", total=" + total + ", basePay=" + basePay
				+ ", meritPay=" + meritPay + ", overtimeWage=" + overtimeWage + ", RewardsPunishmentsWages="
				+ RewardsPunishmentsWages + ", socialSecurity=" + socialSecurity + ", date=" + date + "]";
	}
	public Salary(int id, int eId, String eName, int total, int basePay, int meritPay, int overtimeWage,
			int rewardsPunishmentsWages, int socialSecurity, Date date) {
		super();
		this.id = id;
		this.eId = eId;
		this.eName = eName;
		this.total = total;
		this.basePay = basePay;
		this.meritPay = meritPay;
		this.overtimeWage = overtimeWage;
		RewardsPunishmentsWages = rewardsPunishmentsWages;
		this.socialSecurity = socialSecurity;
		this.date = date;
	}
	public Salary() {
		super();
	}
}
