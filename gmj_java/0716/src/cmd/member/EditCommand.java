package cmd.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cmd.Command;
import member.Member;
import member.Service;
import member.ServiceImpl;

public class EditCommand extends Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		setReqRes(req, res);
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("email");
		Service service = new ServiceImpl();
		service.editMember(new Member(id, pwd, "", email));
		
		redirect(req.getContextPath()+"/views/member/result.jsp");
	}

}
