package guestbook;

import java.util.ArrayList;

public class ServiceImp implements Service {
	private Dao dao;
	public ServiceImp(){
		dao = new DaoImp();
	}
	@Override
	public void addArticle(Article a) {
		// TODO Auto-generated method stub
		dao.insert(a);
	}

	@Override
	public Article getArticle(int num) {
		// TODO Auto-generated method stub
		return dao.select(num);
	}

	@Override
	public ArrayList<Article> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void editArticle(Article a) {
		// TODO Auto-generated method stub
		dao.update(a);
	}
	
	public void delArticle(int num){
		dao.delete(num);
	}

}
