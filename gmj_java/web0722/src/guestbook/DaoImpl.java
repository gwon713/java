package guestbook;

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
	public void insert(Article a) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db ����
		String sql = "insert into guestbook values(seq_guestbook.nextval,?,?,sysdate,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);// PreparedStatement:																// sql ó���ϴ� ��ü
			pstm.setString(1, a.getWriter());// sql�� ?�� ��Ī
			pstm.setString(2, a.getPwd());
			pstm.setString(3, a.getContent());
			int rows = pstm.executeUpdate();// insert, update, delete�� �����ϴ� �޼���, ����� �ټ� ��ȯ											
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
	public Article select(int num) {//�۹�ȣ�� �� �ϳ� �˻��ؼ� Article ��ü�� ��ȯ
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Connection conn = db.getConnect();// db ����
		String sql = "select * from guestbook where num=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);		
			pstm.setInt(1, num);
			rs = pstm.executeQuery();											
			if(rs.next()){
				return new Article(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5));
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
	public ArrayList<Article> selectAll() {//����ü �˻��ؼ� Article ��ü�� ���� ArrayList�� ��� ��ȯ
		// TODO Auto-generated method stub
		ArrayList<Article> list = new ArrayList<Article>();
		ResultSet rs = null;
		Connection conn = db.getConnect();// db ����
		String sql = "select * from guestbook order by num";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);																
			rs = pstm.executeQuery();											
			while(rs.next()){
				list.add(new Article(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
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
	public void update(Article a) {//�۹�ȣ�� ã�Ƽ� �� ������ ����
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db ����
		String sql = "update guestbook set content=? where num=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, a.getContent());
			pstm.setInt(2, a.getNum());
			int rows = pstm.executeUpdate();										
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
	public void delete(int num) {//�۹�ȣ�� ����
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db ����
		String sql = "delete guestbook where num=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, num);
			int rows = pstm.executeUpdate();										
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
