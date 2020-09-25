package product;

public class Product {
	private int num;
	private String name;
	private int price;
	private int quantity;
	private String img_path;
	private String info;
	
	public Product() {

	}
	
	public Product(int num, String name, int price, int quantity, String img_path, String info) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.img_path = img_path;
		this.info = info;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", img_path="
				+ img_path + ", info=" + info + "]";
	}
	
	
	
}
