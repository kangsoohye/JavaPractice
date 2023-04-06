import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		
		int lottoNum2[] = new int[6];
		
		int i = 0;
		
		a : while(i<6)
		{
			int tt = r.nextInt(45)+1;
			
			for(int j=0; j<6; j++)
			{
				if(tt == lottoNum2[j])
				{
					continue a;
				}
			}
			lottoNum2[i] = tt;
			i++;
		}
		for(int j=0; j<lottoNum2.length; j++)
		{
			System.out.print(lottoNum2[j] + " ");
		}
	}

}
