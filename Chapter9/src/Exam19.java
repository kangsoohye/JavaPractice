import java.util.Scanner;

//백준 2884번 - 알람시계 
public class Exam19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st = new Scanner(System.in);
		
		int H = st.nextInt();
		int M = st.nextInt();
		
		if(M<45)
		{
			if(H == 0)
			{
				H = 23;
				M += 60;
			}
			else
			{
				H -= 1;
				M += 60;
			}
		}
		System.out.println(H + " " + (M-45));
	}

}
