package assignments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class String_To_Date {

	public static void main(String[] args) throws Exception {
		String sDate1="31/12/1998";
		Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(sDate1);
		System.out.println(sDate1+"\t"+date1);

	}

}
