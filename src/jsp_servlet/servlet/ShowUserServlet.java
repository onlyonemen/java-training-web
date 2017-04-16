/**
 * 2017-04-08
 * class 4
 * JSTL标签
 */
package jsp_servlet.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;

public class ShowUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List userList=new UserService().getAllUser();
		req.setAttribute("userList", userList);
		req.getRequestDispatcher("/WEB-INF/pages/showUser.jsp").forward(req, resp);
	}
}
