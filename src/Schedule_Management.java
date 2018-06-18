

public class Schedule_Management {

	public static void main(String[] args) {
		PrintScheduleMenu();
		Repeat_Scanner.NetSc();
		String cmd = Repeat_Scanner.inputNextValues;

		while (true) {
			if (cmd.equals("1")) {
				cmdRegister();
			} else if (cmd.equals("2")) {
				cmdSearch();
			} else if (cmd.equals("3")) {
				cmdCalender();
			} else if (cmd.equals("h")) {
				cmdHelp();
			} else if (cmd.equals("q")) {
				break;
			} else
				System.out.println("메뉴를 다시 확인해주세요.");
		}

	}

	public static void PrintScheduleMenu() {
		System.out.println("=======Menu========");
		System.out.println("1. 일정 등록     ");
		System.out.println("2. 일정 검색     ");
		System.out.println("3. 달력 보기     ");
		System.out.println("h. 도움말       ");
		System.out.println("q. 종료        ");
		System.out.println("===================");
	}

	private static void cmdRegister() {

	}

	private static void cmdSearch() {

	}

	private static void cmdCalender() {

		System.out.println("년도를 입력해주세요.(20000 입력시 종료.)");
		Repeat_Scanner.IntSc();
		int year = Repeat_Scanner.inputIntValues;

		System.out.println("월을 입력해주세요.");
		Repeat_Scanner.IntSc();
		int month = Repeat_Scanner.inputIntValues;
		
		Count_Cal(year, month);

	}
	
	
	private static void cmdHelp() {

	}

	private static void Count_Cal(int year, int month) {

		System.out.println();
		System.out.printf("             %d년 %월", year, month);
		System.out.println("=================================");
		System.out.println("Sun  Mon  Tue  Wed  Thr  Fri  Sat");
		
		//int weekday = GetWeekDay(year, month, 1);

		int StandardYear = 1970;
		int StandardMonth = 1;
		int StandardDay = 1;
		int StandardWeekDay = 3; // 1970.1.1.Thursday.

		
		
		int count = 0;

		for (int i = StandardYear; i < year; i++) {
			int delta;
			
			
		}

		
	}
	
	/*private static int GetWeekDay(int year, int month, int day) {
		int S_Year = 1970;
		
		final int STANDARD_WEEKDAY = 3;
		
		int count = 0 ;
		
		for (int i = S_Year ; i < year ; i ++) {
			int mata = isLeapYear(i) ? 366 : 365 ;
			count += mata ;
		}
		
		for (int i = 1 ; i < month ; i++) {
			
		}
		return 0;
	}*/

	//윤년 계산.
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

}
