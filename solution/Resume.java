package day19.solid.srp.solution;

public class Resume {
	private String candidateName;
	private String emailID;
	private long mobileNo;
	private int experience;
	private String technology;
	private String softskills[];
	
	public Resume() {}
	public Resume(String candidateName, String emailID, long mobileNo, int experience, String technology) {
		this.candidateName = candidateName;
		this.emailID = emailID;
		this.mobileNo = mobileNo;
		this.experience = experience;
		this.technology = technology;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Resume [candidateName=" + candidateName + ", emailID=" + emailID + ", mobileNo=" + mobileNo
				+ ", experience=" + experience + "]";
	}
}
