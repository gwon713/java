package member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.dbconn.DBConn;
public class DaoImp implements Dao {
	private DBConn db;
	
	public DaoImp(){
		db = DBConn.getInstance();
	}
	
	
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();
		String sql = "insert into member values(?,?,?,?)";
		try{
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, m.getId());
			pstm.setString(2, m.getPwd());
			pstm.setString(3, m.getName());
			pstm.setString(4, m.getEmail());
			int rows = pstm.executeUpdate();
			System.out.println(rows+" 줄이 추가되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
		} finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public Member select(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
