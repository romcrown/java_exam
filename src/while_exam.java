
public class while_exam {

	public static void main(String[] args) {
		
		int rep ;
		System.out.println("반복할 숫자를 입력하세요.");
		Repeat_Scanner.IntSc();
		rep = Repeat_Scanner.inputIntValues;
		
		System.out.println("총 "+ rep +" 번 반복 합니다.");
		
		int a = 1;
		while(a < rep) {
			System.out.println( a +" 번 반복중입니다.");
			a++;
			if(a == rep) {
				System.out.printf("%d 번 반복중입니다.\n",rep);
				System.out.printf("총 %d 반복 했습니다.\n 종료합니다.",rep);
				break;
				
			}
					
		}
	}
	
}
