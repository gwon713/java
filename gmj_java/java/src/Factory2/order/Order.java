package Factory2.order;

import Factory2.wh.Product;

public class Order {
	private int num;//주문번호
	private Product prod;//주문제품의 번호
	private int amount;//주문수량
	private int total_price;//결제금액: 제품price*amount(주문수량)
	private boolean pay_flag;// 결제유무:true(결제했음), false(결제안했음.기본값)
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
