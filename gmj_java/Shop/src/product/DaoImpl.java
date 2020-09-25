package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.dbconn.DBConn;

public class DaoImpl implements Dao {
	private DBConn db;

	public DaoImpl() {
		db = DBConn.getInstance();
	}
	
	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnect();// db ¿¬°á
		String sql = "insert into shop_product values(seq_shop_product.nextval,?,?,?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, p.getName());
			pstm.setInt(2, p.getPrice());
			pstm.setInt(3, p.getQuantity());
			pstm.setString(4, p.getImg_path());
			pstm.setString(5, p.getInfo());
			pstm.executeUpdate();
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
	public Product selectByNum(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub

	}

}
