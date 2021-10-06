package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainmethod {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF MOVIES");
		int n=sc.nextInt();
		String hero="";
		String heroin="";
		String result="";
		for(int i=0;i<n;i++)
			
		{
			System.out.println("ENTER HERO NAME");
			hero=sc.next();
			a.add(hero);
			System.out.println("ENTER HEROIN NAME");
			heroin=sc.next();
			a.add(heroin);
			System.out.println("ENTER RESULTS");
			result=sc.next();
			a.add(result);
			
		
		}
		for(int i=0;i<a.size()-2;i++)
		{
			Movie m=new Movie(a.get(i),a.get(i+1),a.get(i+2));
			i=i+2;
			System.out.println(m);
		}
		
       }
	}


