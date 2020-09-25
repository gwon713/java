package kiosk;

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
	public void insert(Food f) {
		// TODO Auto-generated method stub
		String sql = "insert into food values(seq_food.nextval,?,?)";
		
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, f.getName());
			pstmt.setInt(2, f.getPrice());
			pstmt.executeQuery();
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
	public ArrayList<Food> selectAll() {
		String sql = "select * from food";
		ArrayList<Food> list = new ArrayList<Food>();
		ResultSet rs = null;
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				Food m = new Food(num, name, price);
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
	public void update(Food f) {
		// TODO Auto-generated method stub
		String sql = "update food set price=? where num=?";
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, f.getPrice());
			pstmt.setInt(2, f.getNum());
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
	public void delete(String name) {
		// TODO Auto-generated method stub
		String sql = "delete food where name=?";
		Connection conn = db.getConnect();
		try {		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);		
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
	public int selectDay() {
		// TODO Auto-generated method stub
		String sql = "select sum(price) from ord where to_char(odate, 'dd/mm/yy') like to_char(sysdate, 'dd/mm/yy')";
		Connection conn = db.getConnect();
		ResultSet rs = null;
		int total=0;
		try {		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			total = rs.getInt(1);
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
		return total;
	}

	@Override
	public int selectMonth() {
		// TODO Auto-generated method stub
		String sql = "select sum(price) from ord where to_char(odate, 'mm/yy') like to_char(sysdate, 'mm/yy')";
		Connection conn = db.getConnect();
		ResultSet rs = null;
		int total=0;
		try {		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			total = rs.getInt(1);
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
		return total;
	}
	
}
