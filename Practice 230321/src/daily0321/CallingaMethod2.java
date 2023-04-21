package daily0321;

import java.util.Calendar;

public class CallingaMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR)); 			//년
		System.out.println(calendar.get(Calendar.MONTH));			//월(1월=0)
		System.out.println(calendar.get(Calendar.DATE));			//일
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));		//이 주의 시작요일
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));	//이 달의 n번째일
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));		//올해의 n번째일
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.MILLISECOND));
	}

}
