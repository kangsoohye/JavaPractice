import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner std = new Scanner(System.in);
		System.out.print("�Է��� ����: ");
		
		int n = std.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++)
		{
			array[i] = std.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		
		for(int j=0; j<n; j++)
		{
			if(min>array[j])
			{
				min = array[j];
			}
			else
			{
				max = array[j];
			}
		}
		System.out.println(min + " " + max);
	}

}
