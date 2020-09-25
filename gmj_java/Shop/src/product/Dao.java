package product;

import java.util.ArrayList;


public interface Dao {
	void insert(Product p);
	Product selectByNum(int num);
	ArrayList<Product> selectByName(String name);
	ArrayList<Product> select();
	void update(Product p);
	void delete(int num);
}
