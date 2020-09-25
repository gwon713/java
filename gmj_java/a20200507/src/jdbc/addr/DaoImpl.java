package jdbc.addr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.dbconn.DBConn;

public class DaoImpl implements Dao {
	private DBConn db;

	public DaoImpl() {
		db = DBConn.getInstance();
	}

	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		// String sql2 = "insert into addr
		// values(seq_addr.nextval,'"+m.getName()+"', '"
		// +m.getTel()+"', '"+m.getAddress()+"')";

		String sql = "insert into addr values(seq_addr.nextval,?,?,?)";
		// 1.db Ŀ�ؼ� ����
		Connection conn = db.getConnect();
		try {
			// 2.Ŀ�ؼ� ��ü�� ������Ʈ��Ʈ ��ü ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// sql���� ? ����
			pstmt.setString(1, m.getName());// 1�� ����ǥ�� ��� ��ü�� name����.
			pstmt.setString(2, m.getTel());
			pstmt.setString(3, m.getAddress());

			// 3. sql����:executeUpdate()->���� ���� / executeQuery()->�б� ����
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public ArrayList<Member> selectByName(String name) {
		// TODO Auto-generated method stub
		String sql = "select * from addr where name=?";
		String sql2 = "select * from addr where name like '%" + name + "%'";
		ArrayList<Member> list = new ArrayList<Member>();
		ResultSet rs = null;
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {// rs.next(): �˻� ������� �� �̵�
				list.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public Member selectByNum(int num) {
		// TODO Auto-generated method stub
		String sql = "select * from addr where num=?";
		ResultSet rs = null;
		Member m = null;
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {// rs.next(): �˻� ������� �� �̵�
				m = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return m;
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from addr";
		ArrayList<Member> list = new ArrayList<Member>();
		ResultSet rs = null;
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {// rs.next(): �˻� ������� �� �̵�
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				Member m = new Member(num, name, tel, address);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void update(Member m) {// ������ ����� ��ȣ,����ȭ,���ּҸ� �޾ƿ�
		// TODO Auto-generated method stub
		String sql = "update addr set tel=?, address=? where num=?";
		Connection conn = db.getConnect();
		try {
			// 2.Ŀ�ؼ� ��ü�� ������Ʈ��Ʈ ��ü ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getTel());
			pstmt.setString(2, m.getAddress());
			pstmt.setInt(3, m.getNum());
			// 3. sql����:executeUpdate()->���� ���� / executeQuery()->�б� ����
			pstmt.executeUpdate();//���ŵ� �� ��
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql = "delete addr where num=?";
		Connection conn = db.getConnect();
		try {		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);		
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
