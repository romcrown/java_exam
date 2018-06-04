import java.util.Scanner;

public class mul {

	
	public static void main(String[] args) {
		
		System.out.print("출력하고 싶은 단을 입력해주세요(숫자만 입력) : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		//System.out.println(number+" 단");
		
		
		
		int a; //곱할때 사용할 숫자
		
		if(number >=2 && number <=9  ) {
			int b ;
		    for(b=2;b<=number;b++) {
		    	    System.out.println(b+"단");
		    		for(a=1;a<=9;a++) {
		    		System.out.println(b+" x "+a+" = " + b * a);
		    		}
		    }
		 
		}
		else {
			System.out.println("입력한 값을 다시 확인해 주세요.");
			
		}
		 
		
		//for 문 사용 출력하고 싶은 단 만 출력 하는 구문  
		
		/*for(a=1;a<=9;a++) {
			System.out.println(number+" x "+a+" = "+number * a);
		}*/
		
		//for 문을 사용해서 입력한 값 이하의 단들 전부 출력 
		
		/*int b ;
	    for(b=2;b<=number;b++) {
	    	    System.out.println(b+"단");
	    		for(a=1;a<=9;a++) {
	    		System.out.println(b+" x "+a+" = " + b * a);
	    		}
	    }*/
		
		
				}
}
