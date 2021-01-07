package model;

public class Student {
	private int id;
	private String name;
	private int rollno;
	private String grade;
public Student() {
	
}
	public Student(int id, String name, int rollno, String grade) {
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student:\nid:"+ id +"\nname:" + name + "\nrollno:" + rollno + "\ngrade:" + grade;
	}
}
