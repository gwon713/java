package p0421;

public class Service {
	private Dao dao;
	
	public Service(Dao dao){
		this.dao = dao;
	}
	public void add(){
		dao.insert();
	}
	public void get(){
		dao.select();
	}
	public void edit(){
		dao.update();
	}
	public void del(){
		dao.delete();
	}
}
