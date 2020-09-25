package p0414;

import java.util.Date;
import java.util.Calendar;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println((d.getMonth()+1)+"월"+d.getDate()+"일"+d.getHours()+"시"
				+d.getMinutes()+"분"+d.getSeconds()+"초");
	}

}
