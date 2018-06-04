import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int[] result = new int[9];
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("출력하고 싶은 구구단을 입력 하세요 : \n");
	    int number = sc.nextInt();
	    
	    for(int a = 2;a<=number;a++) {
	    	System.out.println(a+"단 \n");
	    	for(int i = 0;i<result.length;i++) {
				result[i] = a * (i+1);
				System.out.println(a+" * "+(i+1)+" = "+result[i]);
			}
	    	System.out.println();
			
	    }
	    
	    //ArrayOutOfBoundsException 이라는 오류를 보게 되면 정해놓은 배열 값을 추가 했을 때 발생한다 
	    //ex) int[9] 로 설정해 놓았으면 마지막 배열의 값은 8이 된다. 배열이 시작 할때 int[9]로 정해 놓았으면 0,1,2,3,4,5,6,7,8 이렇게 되기 때문이다.
	    //System.out.println("int[9]"); 이렇게 하면 오류 발
	}
}
