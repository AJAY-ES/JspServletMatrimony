package service;

import dao.StudentDAO;
import model.Student;

public class StudentService {
	public Student getStudent(String name) {
		//Student s = new Student(123, "ajay", 1, "A grade");
		StudentDAO studentDAO=new StudentDAO();
		Student s1=(Student) studentDAO.dbInSql(name);
		return s1;
	}
}
