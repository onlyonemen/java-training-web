package jsp_servlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;

import models.User;

public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		User user = new User();
		user.setUserName(req.getParameter("user"));
		user.setPassword(req.getParameter("password"));

		if (new UserService().validateUser(user)) {
			req.getSession().setAttribute("user", user.getUserName());
			req.setAttribute("user", user.getUserName());
			req.getRequestDispatcher("/WEB-INF/pages/welcome.jsp").forward(req,
					resp);// 区别于sendRedirect
		} else {
			req.setAttribute("msg", "username or password wrong");
			req.getRequestDispatcher("pages/login.jsp").forward(req, resp);
		}

	}

}
