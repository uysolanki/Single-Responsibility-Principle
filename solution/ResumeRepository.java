package day19.solid.srp.solution;

public class ResumeRepository {
	
	Resume resumeList[];
	
	public ResumeRepository(Resume resumeList[])
	{
		this.resumeList=resumeList;
	}
	

	public void filterResumeByExperience(int years)
	{
		for(int i=0;i<resumeList.length;i++)
		{
			if(resumeList[i].getExperience()>=years)
			{
			System.out.println("Name "+resumeList[i].getCandidateName());
			System.out.println("Mobile "+resumeList[i].getMobileNo());
			System.out.println("Email "+resumeList[i].getEmailID());
			}
		}
	}
	
	public void filterResumeByTechnology(String tech)
	{
		for(Resume r:resumeList)
		{
			if(r.getTechnology().equalsIgnoreCase(tech))
			{
			System.out.println("Name "+r.getCandidateName());
			System.out.println("Mobile "+r.getMobileNo());
			System.out.println("Email "+r.getEmailID());
			}
		}
	}

}
