package day19.solid.srp.problem;

import java.util.Arrays;

public class Resume {
	private String candidateName;
	private String emailID;
	private long mobileNo;
	private int experience;
	private String technology;
	Resume shinedotcom[]=new Resume[5];
	
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
				+ ", experience=" + experience + ", technology=" + technology + "]";
	}
	
	
	public void filterResumeByExperience(int experience)
	{
		for(int i=0;i<shinedotcom.length;i++)
		{
		if(shinedotcom[i].getExperience()>=experience)
		{
			System.out.println("Name "+shinedotcom[i].candidateName);
			System.out.println("Mobile "+shinedotcom[i].mobileNo);
			System.out.println("Email "+shinedotcom[i].emailID);
		}
		}
	}
	
	
	public void filterResumeByTechnology(String technology)
	{
		for(int i=0;i<shinedotcom.length;i++)
		{
		if(shinedotcom[i].technology.equals(technology))
		{
			System.out.println("Name "+shinedotcom[i].candidateName);
			System.out.println("Mobile "+shinedotcom[i].mobileNo);
			System.out.println("Email "+shinedotcom[i].emailID);
		}
		}
		
	}
	
	public void createResumeRepository()
	{
		
		Resume r1=new Resume("Alice","alice@gmail.com",9890123123L,5,"Java");
		Resume r2=new Resume("Ben","ben@gmail.com",9890111222L,3,"Python");
		Resume r3=new Resume("Chris","chris@gmail.com",9890333444L,9,"DotNet");
		Resume r4=new Resume("Dom","dom@gmail.com",9890555666L,2,"Java");
		Resume r5=new Resume("Elcid","elcid@gmail.com",9890777888L,6,"React");
		shinedotcom[0]= r1;
		shinedotcom[1]= r2;
		shinedotcom[2]= r3;
		shinedotcom[3]= r4;
		shinedotcom[4]= r5;
		System.out.println(Arrays.toString(shinedotcom));
	}
	

}
