package day19.solid.srp.solution;

import java.util.Scanner;

public class SrpDriverApp {

	public static void main(String[] args) {
		Resume r1=new Resume("Alice","alice@gmail.com",9890123123L,5,"Java");
		Resume r2=new Resume("Ben","ben@gmail.com",9890111222L,3,"Python");
		Resume r3=new Resume("Chris","chris@gmail.com",9890333444L,9,"DotNet");
		Resume r4=new Resume("Dom","dom@gmail.com",9890555666L,2,"Java");
		Resume r5=new Resume("Elcid","elcid@gmail.com",9890777888L,6,"React");
		Resume listResume[]= {r1,r2,r3,r4,r5};
		ResumeRepository shinedotcom=new ResumeRepository(listResume);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter Number of years exp looking for");
		int n=sc.nextInt();
		shinedotcom.filterResumeByExperience(n);
		
		System.out.println("please enter Technology looking for");
		String t=sc.next();
		shinedotcom.filterResumeByTechnology(t);

	}

}
