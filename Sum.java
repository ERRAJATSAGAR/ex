import java.util.Scanner;

public class Sum {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the two numbers to add : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			System.out.println("The sum of two numbers is : "+ sum);
	}

}