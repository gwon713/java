package guestbook;

import java.util.ArrayList;

public interface Dao {
	void insert(Article a);//�۹�ȣ, �ۼ��� �ڵ�
	Article select(int num);
	ArrayList<Article> selectAll();
	void update(Article a);
	void delete(int num);
}
