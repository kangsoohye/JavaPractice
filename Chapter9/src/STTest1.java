import java.util.StringTokenizer;

public class STTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "국적 대한민국 이름 홍길동 성별 남자 주소 서울시";
		String s2 = "국적;대한민국;이름;홍길동;성별;남자;주소;서울시";
		
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
