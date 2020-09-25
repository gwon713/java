package Factory2.order;

import Factory2.wh.Product;

public class Order {
	private int num;//�ֹ���ȣ
	private Product prod;//�ֹ���ǰ�� ��ȣ
	private int amount;//�ֹ�����
	private int total_price;//�����ݾ�: ��ǰprice*amount(�ֹ�����)
	private boolean pay_flag;// ��������:true(��������), false(����������.�⺻��)
	private boolean out_flag;
	private static int cnt;

	public Order() {
	}

	public Order(Product p, int amount) {
		this.num = ++cnt;
		this.prod = p;
		this.amount = amount;
		this.total_price = p.getPrice() * amount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public boolean isPay_flag() {
		return pay_flag;
	}

	public void setPay_flag(boolean pay_flag) {
		this.pay_flag = pay_flag;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Order.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Order [num=" + num + ", prod=" + prod + ", amount=" + amount + ", total_price=" + total_price
				+ ", pay_flag=" + pay_flag + "]";
	}

	public boolean isOut_flag() {
		return out_flag;
	}

	public void setOut_flag(boolean out_flag) {
		this.out_flag = out_flag;
	}

	
	
}
