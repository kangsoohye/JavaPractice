import java.util.Scanner;

//백준 25304번 - 영수증
public class Exam18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st = new Scanner(System.in);
		
		int total = st.nextInt();
		int type = st.nextInt();
		int sum = 0;
		
		for(int i = 0; i<type; i++)
		{
			int a = st.nextInt();
			int b = st.nextInt();
			sum += a*b;
		}
		
		if(total == sum)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
