package one;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

	public static void main(String args[])
	  {
		
		String pattern = "MMddyyyyHHmmss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
	//	System.out.println(date);
		
		
	    
		
		//System.out.println(validateFileNameWithDateFormat("DDMS_Check_Status_03092020124559.txt ", pattern));
		/*System.out.println(validateFileNameWithDateFormat("DDMS_Check_Status_03722020165303.txt ", pattern));*/
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");  
		SimpleDateFormat formatter1 = new SimpleDateFormat(pattern);  
	    Date date1 = new Date();  
	    System.out.println(formatter.format(date1));
	    System.out.println(formatter1.format(date1));
		
		
	  }
	
	
	public static boolean validateFileNameWithDateFormat(String fileName, String pattern) {

		try {
			// return the substring before .txt
			String subStr = fileName.substring(0, fileName.lastIndexOf("."));

			// get the required characters for date validation
			String subS = subStr.substring(subStr.length() - pattern.length());

			DateFormat sdf = new SimpleDateFormat(pattern);
			sdf.setLenient(false);
			try {
				sdf.parse(subS);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;

		} catch (Exception e) {
			return false;
		}

	}
			
	
	
}
