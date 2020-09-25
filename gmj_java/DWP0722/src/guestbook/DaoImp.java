package guestbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoImp implements Dao {
	private DBConn db;
	
	public DaoImp(){
		db = DBConn.getInstance();
	}	
	@Override
	public void insert(Article a) {
		// TODO Auto-generated method stub
		String sql = "insert into guestbook values(seq_guestbook.nextval,?,?,sysdate,?)";
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, a.getWriter());
			pstm.setString(2, a.getPwd());
			pstm.setString(3, a.getContent());
			int rows = pstm.executeUpdate();	
			System.out.println(rows + " 줄이 추가되었습니다. ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public Article select(int num) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from guestbook where num=?";
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, num);
			rs = pstm.executeQuery();
			if(rs.next()){
				return new Article(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getDate(4),rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
	public ArrayList<Article> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Article> list = new ArrayList<Article>();
		ResultSet rs = null;
		String sql = "select * from guestbook";
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				list.add(new Article(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getDate(4),rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
	public void update(Article a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub

	}

}
