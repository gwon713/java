package cmd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Command {// �߻� �޼��� ����
	protected HttpServletRequest req;
	protected HttpServletResponse res;

	// ����� ����
	public abstract void execute(HttpServletRequest req, HttpServletResponse res);// ��û��
																					// ����

	public void setReqRes(HttpServletRequest req, HttpServletResponse res) {
		this.req = req;
		this.res = res;
	}

	public void forward(String url) {
		System.out.println(url);
		RequestDispatcher rd = req.getRequestDispatcher(url);
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void redirect(String url) {
		try {
			res.sendRedirect(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
