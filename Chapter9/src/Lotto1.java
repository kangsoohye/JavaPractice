import java.util.Random;

public class Lotto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		
		int lottonum1[] = new int[6];
		
		int i=0;
		
		a: while(i<6)
		{
			int t = r.nextInt(45)+1;
			
			for(int j=0; j<i; j++)
			{
				if(t == lottonum1[j])
				{
					continue a;
				}
			}
			lottonum1[i] = t;
			i++;
		}
		
		for(int j=0; j<lottonum1.length; j++)
		{
			System.out.print(lottonum1[j] + " ");
		}
	}

}
