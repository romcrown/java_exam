import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Calender {

	/*
	 * private static final int[] max_day = {31, 29, 30, 31, 30, 31, 30, 29, 30, 29,
	 * 30, 31};
	 * 
	 * public int get_max_day(int month) { return max_day[month - 1]; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Calender cal = new Calender();
	 * 
	 * System.out.println("마지막날을 알고 싶은 달 : "); Scanner sc = new Scanner(System.in);
	 * int Input = sc.nextInt();
	 * 
	 * int[] Max_Day = {31, 27, 30, 31, 30, 31, 30, 29, 30, 29, 30, 31};
	 * System.out.printf("%d월의 최대 일수는 %d일 입니다.", Input, cal.get_max_day(Input));
	 * //printf 는 C의 기능을 사용가능하게 해준다.
	 * 
	 * sc.close();
	 * 
	 * }
	 */
	/*
	 * public static void KoreaTime() { Calendar cal = new
	 * GregorianCalendar(Locale.KOREA); int Year, Month, nDay, FirDay, LastDay; Year
	 * = cal.get(Calendar.YEAR); Month = cal.get(Calendar.MONTH); nDay =
	 * cal.get(Calendar.DAY_OF_MONTH); FirDay = cal.get(Calendar.DAY_OF_MONTH); }
	 */
	// public static Calendar cal = new GregorianCalendar(Locale.KOREA);

	/*
	 * public static void month(int mon) { int Month = cal.get(Calendar.MONTH); }
	 */

	public static int[] mon = { 30, 28, 30, 31, 29, 30, 31, 30, 29, 30, 31, 31 };

	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar(Locale.KOREA);
		
		while (true) {
			
			System.out.println("출력하고 싶은 년도를 입력하세요.(20000을 입력하면 프로그램을 종료합니다.)");
			Repeat_Scanner.IntSc();
			int year = Repeat_Scanner.inputIntValues;
			int PrintYear = cal.get(Calendar.YEAR);
			if (year == 20000) {
				System.out.println("Stop");
				break;
			}

			System.out.println("출력하고 싶은 달을 입력하세요.");
			Repeat_Scanner.IntSc();
			int month = Repeat_Scanner.inputIntValues;

			if (month <= 12) {

				System.out.println("처음 시작하고 싶은 요일을 입력하세요.(Sun, Mon, Tue, Wed, Thr, Fri, Sat)");
				Repeat_Scanner.SprtSC();
				String Startday = Repeat_Scanner.inputStrValues;

				if (Startday.equals("Sun") || Startday.equals("Mon") || Startday.equals("Tue") || Startday.equals("Wed")
						|| Startday.equals("Thr") || Startday.equals("Fri") || Startday.equals("Sat")) {

					if (month <= 12) {
						System.out.println(month + "월의 마지막 날 -> " + mon[month - 1] + "일");
						printcal(year, month, Startday);
					}

				} else {
					System.out.println("요일을 다시 확인해 주세요.");

				}
			} else {
				System.out.println("1~12 사이의 숫자를 입력해주세요.");
			}
		}

	}

	public static int day(String day) {
		if (day.equals("Sun"))
			return 0;
		else if (day.equals("Mon"))
			return 1;
		else if (day.equals("Tue"))
			return 2;
		else if (day.equals("Wed"))
			return 3;
		else if (day.equals("Thr"))
			return 4;
		else if (day.equals("Fri"))
			return 5;
		else if (day.equals("Sat"))
			return 6;
		else
			return 7;

	}

	public static void printcal(int Year, int Month, String Startday) {
		System.out.println();
		System.out.printf("          %d년 %d월\n", Year, Month);
		System.out.println("Sun  Mon  Tue  Wed  Thr  Fri  Sat");
		System.out.println("=================================");

		for (int b = 0; b < day(Startday); b++) {
			System.out.print("     ");
		}

		int count = 7 - day(Startday);
		int deline = (count < 7) ? count : 0;
		/*
		 * if(deline < 7){
		 *    count = delline;
		 * }
		 * else{
		 *    count = 0;
		 * }
		 */
		
		for (int i = 1; i <= count; i++  ) {
			System.out.printf("%3d  ",i);
		}
		System.out.println();
		
		count++;
		for (int a = count; a <= mon[Month - 1]; a++) {
			System.out.printf("%3d  ", a);
			if (a % 7 == deline) {
				System.out.println();
			}

		}
		System.out.println();
		System.out.println();
	}
}
