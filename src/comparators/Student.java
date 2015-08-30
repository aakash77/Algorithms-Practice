package comparators;

import java.util.Comparator;

public class Student{
	
	/**
	 * class members
	 */
	private int rollno;
	private String name;
	private int age;
	
	public Student(int rollno,String name,int age){
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "{Name : "+this.name+",Age : "+this.age+",RollNo : "+this.rollno+"}"; 
	}

	//Compare by name
	public static class ByName implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	//Compare by rollno
	public static class ByRollNo implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getRollno()>o2.getRollno())
				return 1;
			else if(o1.getRollno()<o2.getRollno())
				return -1;
			else
				return 0;
		}
	}

	//Compare by age
	public static class ByAge implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getAge()>o2.getAge())
				return 1;
			else if(o1.getAge()<o2.getAge())
				return -1;
			else
				return 0;
		}
	}
}