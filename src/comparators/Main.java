package comparators;

import java.util.Comparator;

import comparators.Student.ByRollNo;

public class Main {

	public static void main(String[] args) {

		
		/*final Comparator<Student> BY_NAME = new ByName();
		final Comparator<Student> BY_AGE = new ByAge();*/
		final Comparator<Student> BY_ROLLNO = new ByRollNo();

		Student s1 = new Student(2,"B",12);
		Student s2 = new Student(1,"A",30);
		Student s3 = new Student(3,"C",22);
		Student s4 = new Student(9,"E",19);
		Student s5 = new Student(5,"F",15);

		Student s[] = {s1,s2,s3,s4,s5};

		Sort selection = new Sort();
		selection.sort(s, BY_ROLLNO);
		for(Student obj : s)
			System.out.println(obj.toString());
	}
}