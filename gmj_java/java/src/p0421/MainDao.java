package p0421;

public class MainDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service(new DaoImp());
		service.add();
		service.get();
		service.edit();
		service.del();
	}

}
