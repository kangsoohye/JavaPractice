//���� 11721�� - �� ���� ���� ����ϱ�
import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st = new Scanner(System.in);
		String a = st.next();
		
		for(int i = 0; i<a.length(); i++)
		{
			System.out.print(a.charAt(i));
			if(i%10 == 9)
			{
				System.out.println();
			}
		}
	}

}
