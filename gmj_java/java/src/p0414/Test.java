package p0414;

import java.util.Date;
import java.util.Calendar;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println((d.getMonth()+1)+"��"+d.getDate()+"��"+d.getHours()+"��"
				+d.getMinutes()+"��"+d.getSeconds()+"��");
	}

}
