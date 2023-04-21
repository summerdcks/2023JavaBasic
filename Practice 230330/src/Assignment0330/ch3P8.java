package Assignment0330;

import java.util.Calendar;
import java.util.Scanner;

public class ch3P8 {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        int add = 0;
	        try {
	        	add = scanner.nextInt();
	        } catch (Exception e) {
	        	
	        }

	        int year = Integer.parseInt(input.substring(0, 4));
	        int month = Integer.parseInt(input.substring(4, 6));
	        int day = Integer.parseInt(input.substring(6, 8));
	       
	        Calendar calendar = Calendar.getInstance();
	        calendar.set(year, month - 1, day);
	        calendar.add(Calendar.DATE, add);

	        int addedYear = calendar.get(Calendar.YEAR);
	        int addedMonth = calendar.get(Calendar.MONTH) + 1; 
	        int addedDay = calendar.get(Calendar.DAY_OF_MONTH);
	        
	        if (addedMonth < 10) {
	        	 System.out.println(addedYear + "0" + addedMonth + "" + addedDay);
	        } else if (addedMonth >= 10) {
	        	 System.out.println(addedYear + "" + addedMonth + "" + addedDay);
	        }
	    }
}
