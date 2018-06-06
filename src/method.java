import java.util.Scanner;

public class method {
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
	
	public static int[] Caculate(int times) {
		int[] result = new int[9];
		int a ;
		for(a = 0 ; a < result.length;a++) {
			result[a] = times * (a + 1);
		}
		return result;
	}
	
	public static void print (int[] result) {
		
		for(int b = 0 ; b<result.length; b ++) {
			System.out.println(result[b]);
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("구구단");
		
		for(int c = 2 ; c<9; c++) {
		
		int[] result = Caculate(c);
		print(result);
		
		}
	
	}
}
