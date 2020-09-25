package Factory2.order;

import java.util.ArrayList;

public interface Dao {
	void insert(Order o);//�ֹ����
	int getIdxByNum(int num);//�ֹ���ȣ�� �˻��Ͽ� �迭��ġ ��ȯ
	Order selectByNum(int num);//�ֹ���ȣ�� �˻��Ͽ� �ֹ���ü ��ȯ
	ArrayList<Order> selectAll();//��ü�˻��Ͽ� ��ȯ
	void del(int num);//�ֹ���ȣ�� �ֹ�����(���)
	ArrayList<Order> selectByPayFalse();//���� ��� ���
	ArrayList<Order> selectByOut();//��� ��� ���
	void updateFlag(int num, boolean flag);
}
