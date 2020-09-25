package Factory.order;

import Factory.warehouse.Product;

public class Order {
	private int num;//주문번호
	private int prod_num;//주문제품의 번호
	private int amount;//주문수량
	private int total_price;//결제금액: 제품price*amount(주문수량)
	private boolean pay_flag;// 결제유무:true(결제했음), false(결제안했음.기본값)
	private static int cnt;

	public Order() {
	}

	public Order(Product p, int amount) {
		this.num = ++cnt;
		this.prod_num = p.getNum();
		this.amount = amount;
		this.total_price = p.getPrice() * amount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getProd_num() {
		return prod_num;
	}

	public void setProd_num(int prod_num) {
		this.prod_num = prod_num;
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

	@Override
	public String toString() {
		return "Order [num=" + num + ", prod_num=" + prod_num + ", amount=" + amount + ", total_price=" + total_price
				+ ", pay_flag=" + pay_flag + "]";
	}
	
}
