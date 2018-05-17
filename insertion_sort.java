import java.util.Scanner;
import java.util.Arrays;

public class Algorithms
{
	public static int [] read_from_cmd_line() {

		Scanner s = new Scanner(System.in);
		int count = s.nextInt(); // First line gives the count of total inputs
		s.nextLine();          // throw to the next line

		int [] numbers = new int[count];
		Scanner num_Scanner = new Scanner(s.nextLine()); //num_scanner has stored all the numbers on the line
		for(int i = 0; i < count; i++){
			if (num_Scanner.hasNextInt()){
				numbers[i] = num_Scanner.nextInt();
			}
			else {
				System.out.println("You didn't provide enough numbers");
				break;
			}
		}
		return numbers;
	}

	public static int [] insertion_sort(int[] numbers){
		for(int i = 1; i < numbers.length; i++){//   4 | 2 3 5
			for(int j = i; j > 0; j--){         //   2 | 4 3 5
				if(numbers[j] < numbers[j - 1]){//   2 4 | 3 5
					int temp = numbers[j];		//   2 3 4 | 5
					numbers[j] = numbers[j-1];	//	 2 3 4 5
					numbers[j - 1] = temp;
				}
			}

		}
		return numbers;
	}

	public static void main(String[] args)
	{
		int [] numbers = read_from_cmd_line();
		numbers = insertion_sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}