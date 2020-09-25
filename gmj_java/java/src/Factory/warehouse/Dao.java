package Factory.warehouse;

public class Dao {
	private Product[] prods;
	private int cnt;
	
	public Dao(){
		prods = new Product[30];
	}
	
	public void insert(Product p){//제품등록
		
	}
	
	public int getProdIdx(int num){
		return -1;
	}
	
	public Product selectByNum(int num){//제품번호로검색
		return null;
	}
	
	public Product[] selectByName(String name){//제품명으로검색. 이름 중복인경우 여러개 검색되므로 배열에 담아 반환
		return null;
	}
	
	public void updatePrice(Product p){//가격변경
		
	}
	
	public void updateAmount(int num, int a){//입출고 처리
		
	}
	
	public void delete(int num){//제품삭제
		
	}
	
	public Product[] selectAll(){//전체검색
		Product[] p = new Product[cnt];
		System.arraycopy(prods, 0, p, 0, cnt);
		return p;
	}
}
