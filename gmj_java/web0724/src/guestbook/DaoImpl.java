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
		Connection conn = db.getConnect();// db 연결
		String sql = "insert into guestbook values(seq_guestbook.nextval,?,?,sysdate,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);// PreparedStatement:																// sql 처리하는 객체
			pstm.setString(1, a.getWriter());// sql의 ?를 매칭
			pstm.setString(2, a.getPwd());
			pstm.setString(3, a.getContent());
			int rows = pstm.executeUpdate();// insert, update, delete를 실행하는 메서드, 적용된 줄수 반환											
			System.out.println(rows + " 줄이 추가되었습니다. ");
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
	public Article select(int num) {//글번호로 글 하나 검색해서 Article 객체로 반환
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Connection conn = db.getConnect();// db 연결
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
	public ArrayList<Article> selectAll() {//글전체 검색해서 Article 객체로 만들어서 ArrayList에 담아 반환
		// TODO Auto-generated method stub
		ArrayList<Article> list = new ArrayList<Article>();
		ResultSet rs = null;
		Connection conn = db.getConnect();// db 연결
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
	public void update(Article a) {//글번호로 찾아서 글 내용을 수정
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db 연결
		String sql = "update guestbook set content=? where num=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, a.getContent());
			pstm.setInt(2, a.getNum());
			int rows = pstm.executeUpdate();										
			System.out.println(rows + " 줄이 수정되었습니다. ");
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
	public void delete(int num) {//글번호로 삭제
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db 연결
		String sql = "delete guestbook where num=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, num);
			int rows = pstm.executeUpdate();										
			System.out.println(rows + " 줄이 삭제되었습니다. ");
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
