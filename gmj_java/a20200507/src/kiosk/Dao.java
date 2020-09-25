package kiosk;

import java.util.ArrayList;


public interface Dao {
	void insert(Food f);
	
	void update(Food f);

	void delete(String name);
	
	ArrayList<Food> selectAll();
	
	int selectDay();
	
	int selectMonth();
}
