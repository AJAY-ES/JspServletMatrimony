package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Student;

public class StudentDAO {

	public   Student dbInSql(String name) {
		// Jdbc
		Student s=new Student();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "password");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student where name='"+name+"'");
			while (rs.next())
			{	 
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setRollno(rs.getInt(3));
			s.setGrade(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
}
