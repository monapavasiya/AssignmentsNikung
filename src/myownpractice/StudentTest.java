package myownpractice;

import java.util.Arrays;
import java.util.Comparator;

public class StudentTest 
{

	
	public static void main(String[] args) 
	{
		Student s1 = new Student("Mona", 94, 82, 75);
		
		Student s2 = new Student("Anjana", 92, 81, 65);
		
		Student s3 = new Student("Reena", 90, 84, 55);
		
		Student s4 = new Student("Aayushi", 96, 80, 95);
	
		Student s5 = new Student("Nikunj", 98, 88, 78);
		
		Student[] listOfStudent = {s1, s2, s3, s4, s5};
		
		
  // Print maximum English mark  with name
		System.out.println("English Maximum Score");
		System.out.println("-------");
		
		int engMaxScore = 0;
		Student engMaxScoreStudent = null;;
		
		for(Student s : listOfStudent)
		{
			if(engMaxScore < s.engScore)
			{
				engMaxScoreStudent = s;
			}
		}
		System.out.println("Student Name: " + engMaxScoreStudent.name);
		System.out.println("Score: " + engMaxScoreStudent.engScore);
		System.out.println("###############");
		System.out.println();
		
		
 //----Total scores of each students----
		
		  System.out.println("Total Scores of each Students");
		  System.out.println("-------");
		int sum = 0;
		int[] totalSum = new int[listOfStudent.length];
		int i = 0;
		for (Student s : listOfStudent) {

			String name = s.name;
			int math = s.mathScore;
			int eng = s.engScore;
			int sci = s.sciScore;
			
			sum = math + eng + sci;
			
			System.out.println("Total score of " + name + " = " + sum);
			totalSum[i] = sum;
			i++;
		}	
		
		System.out.println("###############");
		System.out.println();
		
		
 // ------Top student-----
		
		System.out.println("Top Student");
		System.out.println("-------");
		int MaxScore = 0;
		Student MaxScoreStudent = null;
		
		for(Student s : listOfStudent)
		{
			if(MaxScore < s.totalScore)
			{
				MaxScore = s.totalScore;
				MaxScoreStudent = s;
			}
		}
		System.out.println("Student Name: " + MaxScoreStudent.name);
		System.out.println("Score: " + MaxScoreStudent.totalScore);
		System.out.println("###############");
		System.out.println();
		
		
		
 //---- Bottom student--
		System.out.println("Bottom Student");
		System.out.println("-------");
		int MinScore = MaxScore;
		Student MinScoreStudent = null;
		
		for(Student s : listOfStudent)
		{
			if( MinScore > s.totalScore)
			{
				MinScore = s.totalScore;
				MinScoreStudent = s;
			}
		}
		System.out.println("Student Name: " + MinScoreStudent.name);
		System.out.println("Score: " + MinScoreStudent.totalScore);
		System.out.println("###############");
		System.out.println();
		
 // -----student's ranks----
		
		System.out.println("Student's Ranks");
		System.out.println("-------");
		Arrays.sort(listOfStudent,Comparator.comparing(Student::gettotalScore));
		int j =1;
		
		for(int m=listOfStudent.length-1; m>=0; m--)
		{
			Student student = listOfStudent[m];
			System.out.print("("+"Rank " + j +")"+ student.name);
			System.out.println(" With " + "Score: " + student.totalScore);
			System.out.println();
			j++;
		}
	
	
	
	
	
	
	
	}
}
