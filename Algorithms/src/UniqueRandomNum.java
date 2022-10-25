
import java.util.Random;

public class UniqueRandomNum {

	public static void main(String[] args) {
		int n = 10;
		int[] numbers = new int[n];
		Random rand = new Random();
		for(int i=0 ;i < numbers.length; i++)
			{
			numbers[i]= rand.nextInt(9) + 1;
			System.out.print(numbers[i] + ", ");
			}
		
		System.out.print("\n");
		
		for (int i = 0;i < 5-1; i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if (numbers[i]==numbers[j]) {
					numbers[j]=(numbers[j]+ 1);
				}
					
			}
		}
		
		for(int i=0 ;i < numbers.length; i++)
		{
		System.out.print(numbers[i] + ", ");
		}
	}

}
