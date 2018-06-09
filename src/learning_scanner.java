import java.util.Scanner;

public class learning_scanner {

	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	// String a = sc.next(); next()는 공백이전 까지의 문자열을 받습니다.
	// int a = sc.next자료형(); 자료형에 따라 next다음에자료형을 넣는다
	// String a = sc.nextLine(); nextLine() 은 공백을 포함한 문자열 전채를 받는다.
	
	// 배열로 
	
	System.out.println("배열의 크기를 입력하세요.");
	int Arraysize = sc.nextInt();
	
	//sc.nextLine(); //엔터 처리해줌 

	String[] str = new String[Arraysize];
	
	for(int b = 0 ; b < str.length ; b++) {
		System.out.println("글자를 입력하세요.");
		sc.nextLine();
		str[b] = sc.next();
	}

	for(int c = 0 ; c < str.length ; c++) {
		System.out.println((c+1)+"번째 "+"글자는 -> " +str[c]);
				
	}

	}
}
