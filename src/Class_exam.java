
public class Class_exam {

	public static int[] Cul(int input) {
		int[] Res = new int[9];
		for(int a = 0 ; a < Res.length ; a++) {
			Res[a] = input * (a + 1);
		}
		return Res;
	}
	
	public static void Print(int[] input_Res) {
		for(int b = 0 ; b<input_Res.length ; b++) {
			System.out.println(input_Res[b]);
		}
	}
	
	
}
