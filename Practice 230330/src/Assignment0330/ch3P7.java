package Assignment0330;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class ch3P7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input two dates : ");
		String intOne = scanner.next();
		String intTwo = scanner.next();
		
		LocalDate startDate = LocalDate.parse(intOne, DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate endDate = LocalDate.parse(intTwo, DateTimeFormatter.BASIC_ISO_DATE);
		// DateTimeFormatter.BASIC_ISO_DATE는 yyyyMMdd 형식의 문자열을 LocalDate 객체로 파싱하기 위한 표준 포맷터
		// LocalDate.parse() 메서드의 두 번째 인자로 이 포맷터를 지정하여 문자열을 LocalDate 객체로 변환 가능
		
		long dayBetween= ChronoUnit.DAYS.between(startDate, endDate);
		
		System.out.println(Math.abs(dayBetween));

	}
}
