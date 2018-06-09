import java.util.Scanner;


public class Calender {

	private static final int[] max_day = {31, 29, 30, 31, 30, 31, 30, 29, 30, 29, 30, 31};
	
	public int get_max_day(int month) {
		return max_day[month - 1];
	}
	
	 public static void main(String[] args) {
		
		 Calender cal = new Calender();
		 
		 System.out.println("마지막날을 알고 싶은 달 : ");
		 Scanner sc = new Scanner(System.in);
		 int Input = sc.nextInt();
		 
		 int[] Max_Day = {31, 27, 30, 31, 30, 31, 30, 29, 30, 29, 30, 31};
		 System.out.printf("%d월의 최대 일수는 %d일 입니다.", Input, cal.get_max_day(Input));
		 //printf 는 C의 기능을 사용가능하게 해준다. 
		 
		 sc.close();
		 
	}
}
