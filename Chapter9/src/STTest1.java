import java.util.StringTokenizer;

public class STTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "���� ���ѹα� �̸� ȫ�浿 ���� ���� �ּ� �����";
		String s2 = "����;���ѹα�;�̸�;ȫ�浿;����;����;�ּ�;�����";
		
		StringTokenizer st = new StringTokenizer(s1);
		
		while(st.hasMoreTokens())
		{
			String title = st.nextToken();
			String value = st.nextToken();
			System.out.println(title + " " + value);
		}
		
		System.out.println("===========================");
		
		StringTokenizer st1 = new StringTokenizer(s2,";");
		
		while(st1.hasMoreTokens())
		{
			String title1 = st1.nextToken(";");
			String value1 = st1.nextToken(";");
			System.out.println(title1 + " " + value1);
		}
	}

}
