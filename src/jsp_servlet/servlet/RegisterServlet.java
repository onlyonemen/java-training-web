package jsp_servlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;

import models.User;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			User user = new User();
			user.setUserName(req.getParameter("username"));
			user.setPassword(req.getParameter("password"));
			user.setSex(req.getParameter("sex").charAt(0));
			user.setSalary(Float.parseFloat(req.getParameter("password")));

			if (new UserService().addUser(user)) {
				req.setAttribute("msg", "register success");
			} else {
				req.setAttribute("msg", "register failed");

			}

			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
