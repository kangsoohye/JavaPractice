import java.util.Scanner;

//백준 14861번 - 사분면 고르기 
public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st = new Scanner(System.in);
		
		int x = st.nextInt();
		int y = st.nextInt();
		
		if(x>0 && y>0)
		{
			System.out.println("1");
		}
		else if(x<0 && y>0)
		{
			System.out.println("2");
		}
		else if(x<0 && y<0)
		{
			System.out.println("3");
		}
		else
		{
			System.out.println("4");
		}
		
	}

}
