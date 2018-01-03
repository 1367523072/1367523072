package comiotek.entity;

public class Resume {
	private int id;
	private String name;
	private int gender;
	private int age;
	private String diploma;//学历
	private String tel;
	private String email;
	private int department;//部门
	private int position;//职位
	private String politicalStatus;//政治面貌
	private String lastJob;
	private String workingExperience;
	private String expectedSalary;//期望薪资
	private String hobbies;//兴趣爱好
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiploma() {
		return diploma;
	}
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getPoliticalStatus() {
		return politicalStatus;
	}
	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}
	public String getLastJob() {
		return lastJob;
	}
	public void setLastJob(String lastJob) {
		this.lastJob = lastJob;
	}
	public String getWorkingExperience() {
		return workingExperience;
	}
	public void setWorkingExperience(String workingExperience) {
		this.workingExperience = workingExperience;
	}
	public String getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Resume [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", diploma=" + diploma
				+ ", tel=" + tel + ", email=" + email + ", department=" + department + ", position=" + position
				+ ", politicalStatus=" + politicalStatus + ", lastJob=" + lastJob + ", workingExperience="
				+ workingExperience + ", expectedSalary=" + expectedSalary + ", hobbies=" + hobbies + "]";
	}
	public Resume() {
		super();
	}
	public Resume(int id, String name, int gender, int age, String diploma, String tel, String email, int department,
			int position, String politicalStatus, String lastJob, String workingExperience, String expectedSalary,
			String hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.diploma = diploma;
		this.tel = tel;
		this.email = email;
		this.department = department;
		this.position = position;
		this.politicalStatus = politicalStatus;
		this.lastJob = lastJob;
		this.workingExperience = workingExperience;
		this.expectedSalary = expectedSalary;
		this.hobbies = hobbies;
	}
	public Resume(String name, int gender, int age, String diploma, String tel, String email, int department,
			int position, String politicalStatus, String lastJob, String workingExperience, String expectedSalary,
			String hobbies) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.diploma = diploma;
		this.tel = tel;
		this.email = email;
		this.department = department;
		this.position = position;
		this.politicalStatus = politicalStatus;
		this.lastJob = lastJob;
		this.workingExperience = workingExperience;
		this.expectedSalary = expectedSalary;
		this.hobbies = hobbies;
	}
	
}
