package myownpractice;

import java.util.Arrays;

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
		int engMaxScore = 0;
		Student engMaxScoreStudent = null;;
		
		for(Student s : listOfStudent)
		{
			if(engMaxScore < s.engScore)
			{
				engMaxScore = s.engScore;
				engMaxScoreStudent = s;
			}
		}
		System.out.println("English Maximum Score");
		System.out.println("-------");
		System.out.println("Student Name: " + engMaxScoreStudent.name);
		System.out.println("Score: " + engMaxScoreStudent.engScore);
		System.out.println();
		
		
		//----Total of marks----
		int sum = 0;
		int[] totalSum = new int[listOfStudent.length];
		String[] n = new String[listOfStudent.length];
		int i = 0;
		for (Student s : listOfStudent) {

			String name = s.name;
			int math = s.mathScore;
			int eng = s.engScore;
			int sci = s.sciScore;

			sum = math + eng + sci;

			System.out.println("Total score of " + name + " = " + sum);

			totalSum[i] = sum;
			n[i] = s.name;
			i++;

		}
		System.out.println();
		
		// ------Top student-----
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
		System.out.println("Maximum Score");
		System.out.println("-------");
		System.out.println("Student Name: " + MaxScoreStudent.name);
		System.out.println("Score: " + MaxScoreStudent.totalScore);
		System.out.println();
		
		
		
		//---- bottom student--
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
		System.out.println("Minimum Score");
		System.out.println("-------");
		System.out.println("Student Name: " + MinScoreStudent.name);
		System.out.println("Score: " + MinScoreStudent.totalScore);
		System.out.println();
		
		
		Arrays.sort(totalSum);
		for(int k=totalSum.length-1; k>=0; k--) {
			System.out.println("********");
			System.out.println(totalSum[k]);
			
		}
		
		for(i=totalSum.length-1; i>0; i--) {
			
			int currentMax = totalSum[0];

			int currentMaxIndex = 0;
			
			for (int k = 1; k <=i; k++) {
				if (currentMax < totalSum[k]) {

					currentMax = totalSum[k];

					currentMaxIndex = k;
			}
		}
			totalSum[currentMaxIndex] = totalSum[i];

			totalSum[i] = currentMax;

			String tempName = n[currentMaxIndex];

			n[currentMaxIndex] = n[i];

			n[i] = tempName;
			System.out.println("**"+tempName);
	}
	
	}
}
