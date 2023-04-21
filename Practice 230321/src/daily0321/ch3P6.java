package daily0321;
import java.util.Scanner;

public class ch3P6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
        int month = scanner.nextInt();

        java.time.YearMonth yearMonth = java.time.YearMonth.of(year, month);
        java.time.LocalDate firstDayOfMonth = yearMonth.atDay(1);
        int dayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        for (int i = 0; i < dayOfWeek ; i++) {
            System.out.print("\t");
        }

        int daysInMonth = yearMonth.lengthOfMonth();
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.print(i + "\t");

            if ((dayOfWeek + i) % 7 == 0) {
                System.out.println();
            }
        }

        if ((dayOfWeek + daysInMonth - 1) % 7 != 0) {
            System.out.println();
        }
		
		
		
		
	}

}
