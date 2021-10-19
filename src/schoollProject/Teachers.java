package schoollProject;

public class Teachers extends Person{
    private String branch;
    private String universty;
    private int startDate;
    private String isStaff;
	public Teachers() {
		super();
	}
	public Teachers(String branch, String universty, int startDate, String isStaff) {
		super();
		this.branch = branch;
		this.universty = universty;
		this.startDate = startDate;
		this.isStaff = isStaff;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getUniversty() {
		return universty;
	}
	public void setUniversty(String universty) {
		this.universty = universty;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public String getIsStaff() {
		return isStaff;
	}
	public void setIsStaff(String isStaff) {
		this.isStaff = isStaff;
	}			
}
