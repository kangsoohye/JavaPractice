import java.util.Scanner;

//백준 1924번 - 2007년
public class Exam21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st = new Scanner(System.in);
		int month = st.nextInt();
		int day = st.nextInt();
		
		String[] d = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int n = day;
		for(int i = 0; i<month-1; i++)
		{
			n += m[i];
		}
		System.out.println(d[n % 7]);
	}

}
