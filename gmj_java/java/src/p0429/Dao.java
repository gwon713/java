package p0429;

import java.util.ArrayList;

public interface Dao {
	void insert(Member m);

	Member selectByNum(int num);
	
	ArrayList<Member> selectByName(String name);
	
	ArrayList<Member> selectAll();

	void update(Member m);

	void delete(int num);
}

