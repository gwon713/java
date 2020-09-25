package cmd.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cmd.Command;
import member.Service;
import member.ServiceImpl;

public class OutCommand extends Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		setReqRes(req, res);
		Service service = new ServiceImpl();
		HttpSession session = req.getSession(false);
		String id = (String) session.getAttribute("id");
		service.delMember(id);
		redirect(req.getContextPath()+"/MemController?cmd=logout");
	}

}
