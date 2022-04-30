package week3.day1assign3;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is "+id);
	}
	
	public void getStudentInfo(String name, int id)
	{
		System.out.println("Student Name is "+name);
		
	}
	
	public void getStudentInfo(String email, long phone)
	{
		System.out.println("Student mail id is "+email);
		System.out.println("Student phone number is "+phone);
	}
	
	public static void main(String[] args) {
		Students students = new Students();
		students.getStudentInfo(123);
		students.getStudentInfo("abc", 456);
		students.getStudentInfo("abc@gmail.com", 9876543210L);
		
	}
}
