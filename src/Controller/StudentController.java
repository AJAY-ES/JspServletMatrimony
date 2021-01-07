package Controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebEndpoint;

import model.Student;
import service.StudentService;

public class StudentController extends HttpServlet {
 
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		System.out.println("name=" + name);
		StudentService studentService = new StudentService();
		Student s = studentService.getStudent(name);
		
		HttpSession session=req.getSession();
		session.setAttribute("s", s);
		res.sendRedirect("home.jsp");
	}
 
}
