package Factory2.order;

import java.util.ArrayList;

public interface Dao {
	void insert(Order o);//주문등록
	int getIdxByNum(int num);//주문번호로 검색하여 배열위치 반환
	Order selectByNum(int num);//주문번호로 검색하여 주문객체 반환
	ArrayList<Order> selectAll();//전체검색하여 반환
	void del(int num);//주문번호로 주문삭제(취소)
	ArrayList<Order> selectByPayFalse();//결제 대상 목록
	ArrayList<Order> selectByOut();//출고 대상 목록
	void updateFlag(int num, boolean flag);
}
