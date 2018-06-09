import java.util.Scanner;

public class exam01 {
 		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열에 넣을 3가지 수를 입력하세요 : ");
		String Input = sc.nextLine();	    	
	    String[] InputValue = Input.split(" ");
	    
	    int a = Integer.parseInt(InputValue[0]);
	    int b = Integer.parseInt(InputValue[1]);
		int c = Integer.parseInt(InputValue[2]);
		
	    System.out.println("넣은 수는 순서대로 1,2,3 에 저장됩니다.");
	    System.out.println("출력하고 싶은 번호를 입력하세요.");	    
	    int Output = sc.nextInt();
	    if(Output == 1) {
	    		System.out.printf("%d",a);
	    }
	    else if(Output == 2) {
	    	 	System.out.printf("%d",b);
	    }
	    else
	    	System.out.printf("%d",c);
	    	    
	    sc.close();
		
	}
}
