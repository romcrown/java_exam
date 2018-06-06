import java.util.Scanner;

public class Calender {

	 public static void main(String[] args) {
		
		 System.out.print("마지막날을 알고 싶은 달 : ");
		 Scanner sc = new Scanner(System.in);
		 int Input = sc.nextInt();
		 
		 int[] Max_Day = {31, 27, 30, 31, 30, 31, 30, 29, 30, 29, 30, 31};
		 System.out.printf("%d달의 최대 일수는 %d일 입니다.", Input, Max_Day[Input - 1]);
		 
		 
		 sc.close();
		 
	}
}
