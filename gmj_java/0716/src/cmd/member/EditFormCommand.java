package cmd.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cmd.Command;
import member.Member;
import member.Service;
import member.ServiceImpl;

public class EditFormCommand extends Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		setReqRes(req, res);
		Service service = new ServiceImpl();
		//���� ��ü ����(false:������ ������ ����, true:������ ������ �����ؼ� ��ȯ)
		HttpSession session = req.getSession(false);
		//�α��� �� ���ǿ� ������ id ����. �� �α��� �� ��� id
		String id = (String) session.getAttribute("id");
		//�� id�� �˻�
		Member m = service.getMember(id);
		//�˻� ��� request�� ���
		req.setAttribute("m", m);
		//�� �������� �̵�. �� ���������� request�� ���� ��ü�� m�̶� �Ҿ�� ��
		forward("/views/member/editForm.jsp");
	}

}
