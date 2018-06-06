import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
	
		System.out.printf("숫자를 입력해 주세요(ex 8,9 = 2x1,.. ,2x9, ..8x1,.. 8x9,.. ) : ");
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt(); int형을 사용할떄 
		String Input = sc.nextLine(); // String 을 사용할때.
		
		String[] Splite = Input.split(",");
		int First = Integer.parseInt(Splite[0]);
		int Second = Integer.parseInt(Splite[1]);
	
		for(int a = 2 ; a <= First ; a++) {
			System.out.println(a+"단");
			for(int b = 1 ; b <= Second ; b++ ) {
				 System.out.println(a+" x "+b+" = "+a*b);
			}
			
		}
	
	}
	
	
}
