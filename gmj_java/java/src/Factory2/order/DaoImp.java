package Factory2.order;

import java.util.ArrayList;


public class DaoImp implements Dao {
	private ArrayList<Order> datas;

	public DaoImp() {
		datas = new ArrayList<Order>();
	}

	@Override
	public void insert(Order o) {
		// TODO Auto-generated method stub
		datas.add(o);
	}

	@Override
	public int getIdxByNum(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order selectByNum(int num) {
		// TODO Auto-generated method stub
		Order o = new Order();
		o.setNum(num);
		int idx = datas.indexOf(o);
		if (idx < 0) {
			return null;
		} else {
			return datas.get(idx);
		}
	}

	@Override
	public ArrayList<Order> selectAll() {
		// TODO Auto-generated method stub
		return datas;
	}

	@Override
	public void del(int num) {
		// TODO Auto-generated method stub
		for(int i=0; i<datas.size(); i++){
			if(num == datas.get(i).getNum()){
				datas.remove(i);
				return;
			}
		}
		System.out.println("없는 번호. 삭제 취소");
	}

	@Override
	public ArrayList<Order> selectByPayFalse() {
		// TODO Auto-generated method stub
		ArrayList<Order> a1 = new ArrayList<Order>();
		for(Order o:datas){
			if(!o.isPay_flag()){
				a1.add(o);
			}
		}
		return a1;
	}

	@Override
	public ArrayList<Order> selectByOut() {
		// TODO Auto-generated method stub
		ArrayList<Order> a1 = new ArrayList<Order>();
		for(Order o:datas){
			if(o.isPay_flag() && !o.isOut_flag()){
				a1.add(o);
			}
		}
		return a1;
	}

	@Override
	public void updateFlag(int num, boolean flag) {
		// TODO Auto-generated method stub
		int idx = datas.indexOf(num);
		if (idx < 0) {
			System.out.println("없는 제품 번호");
		} else {
			Order x = datas.get(idx);
			x.setPay_flag(true);
		}
	}

}
