import java.util.Scanner;


public class Repeat_Scanner {
	
	public static int inputIntValues ;
	public static String inputStrValues, inputNextValues;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
	
	public static void IntSc() {
		Scanner sc = new Scanner(System.in);
		inputIntValues = sc.nextInt();		
		//System.out.println("입력 된 값 -> "+inputIntValues);
		//sc.close();
		
	}
	
	public static void SprtSC()
	{
		Scanner sc = new Scanner(System.in);
		inputStrValues = sc.nextLine();
		//System.out.println("입력 된 값 -> " + inputStrValues);
		//sc.close();
		
	}
	
	public static void NetSc() {
		Scanner sc = new Scanner(System.in);
		inputNextValues = sc.next();
	}
}