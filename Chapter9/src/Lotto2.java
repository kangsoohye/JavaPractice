import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		
		int lottoNum3[] = new int[6];
		
		int i=0;
		
		a : while(i<6)
		{
			int tt = r.nextInt(45)+1;
			for(int j=0; j<i; j++)
			{
				
				if(tt == lottoNum3[j])
				{
					continue a;
				}
			}
			lottoNum3[i] = tt;
			i++;
			
		}
		
		for(int j=0; j<lottoNum3.length; j++)
		{
			System.out.print(lottoNum3[j] + " ");
		}
	}

}
