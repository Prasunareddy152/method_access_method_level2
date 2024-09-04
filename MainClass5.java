class Student
{
	public void takeExam()
	{
		System.out.println("Take Exam");
		Classroom.calculateAverageScore();
	}
	public void submitAssignment()
	{
		System.out.println("Submit Assignment");
	}
}
class Classroom
{
	public static void calculateAverageScore()
	{
		System.out.println("Calculate Average Score");
		Student s1=new Student();
		s1.submitAssignment();
	}
	public static void conductDiscussion()
	{
		System.out.println("Conduct Discussion");
	}
}

class MainClass5 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts..");
		Student s1=new Student();
		s1.takeExam();
		System.out.println("Main ends..");
	}
}
