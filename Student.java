
public class Student {

	private int id;
	private String name;
	String course;
	int marks;
	public Student() {
		System.out.println(" //Constructor with no parameter.");
		System.out.println();
		System.out.println(" student info");
	}
	
	public Student(int i,String j) {
		System.out.println("// constructor with tow parameter.");
		System.out.println();
		this.id=i;
		this.name=j;
		
	}
	public Student(String cn, int k) {
		System.out.println("//constructor overloadig.");
		System.out.println();
		this.course = cn;
		this.marks = k;
		
	}
	public static void main(String[] args) {

		Student std = new Student();
		Student std1 = new Student(78,"jake");
		System.out.println("Id:"+std1.id+ ",name:"+std1.name);
		Student std2 = new Student("java",80);
		System.out.println("course:"+std2.course+ ",marks:"+std2.marks);
	}




}