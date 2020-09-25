package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.dbconn.DBConn;

public class DaoImpl implements Dao {
	private DBConn db;

	public DaoImpl() {
		db = DBConn.getInstance();
	}

	@Override
	public void insert(Member m) {// m: ȸ������ ����(id,pwd, name,email)
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db ����
		String sql = "insert into member values(?,?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);// PreparedStatement:
																// sql ó���ϴ� ��ü
			pstm.setString(1, m.getId());// sql�� ?�� ��Ī
			pstm.setString(2, m.getPwd());
			pstm.setString(3, m.getName());
			pstm.setString(4, m.getEmail());
			int rows = pstm.executeUpdate();// insert, update, delete�� �����ϴ� �޼���, ����� �ټ�											
			System.out.println(rows + " ���� �߰��Ǿ����ϴ�. ");
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
	public Member select(String id) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Connection conn = db.getConnect();// db ����
		String sql = "select * from member where id=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			rs = pstm.executeQuery();// select�� �����ϴ� �޼���, ��ȯ:�˻����											
			if(rs.next()){
				return new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
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
		return null;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db ����
		String sql = "update member set pwd=?, email=? where id=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);			
			pstm.setString(1, m.getPwd());
			pstm.setString(2, m.getEmail());
			pstm.setString(3, m.getId());
			int rows = pstm.executeUpdate();// insert, update, delete�� �����ϴ� �޼���, ����� �ټ�											
			System.out.println(rows + " ���� �����Ǿ����ϴ�. ");
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
	public void delete(String id) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db ����
		String sql = "delete member where id=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);			
			pstm.setString(1, id);
			int rows = pstm.executeUpdate();// insert, update, delete�� �����ϴ� �޼���, ����� �ټ�											
			System.out.println(rows + " ���� �����Ǿ����ϴ�. ");
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
