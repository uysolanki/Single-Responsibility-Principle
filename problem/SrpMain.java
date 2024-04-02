package day19.solid.srp.problem;

import java.util.Scanner;

public class SrpMain {

	public static void main(String[] args) {
		Resume r=new Resume();
		r.createResumeRepository();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter Number of years exp looking for");
		int n=sc.nextInt();
		r.filterResumeByExperience(n);
		
		System.out.println("please enter Technology looking for");
		String t=sc.next();
		r.filterResumeByTechnology(t);

	}

}
