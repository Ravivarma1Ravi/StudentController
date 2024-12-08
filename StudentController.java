public class StudentController {
	public static void main(String[] args) throws Exception
	{
		Student s1=new Student();
		s1.setName("siva");
		s1.setRegno(30);
		s1.setMarks(80);
		s1.setPhonenumber(9348765390l);
		System.out.println(s1.getName());
		System.out.println(s1.getRegno());
		System.out.println(s1.getMarks());
		System.out.println(s1.getPhonenumber());
	}

}
