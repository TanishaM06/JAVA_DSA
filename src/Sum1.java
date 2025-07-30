import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
		sum();
		sum();
	}
	
	static void  sum() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter frist num : ");
		int num1 = input.nextInt();
		System.out.print("Enter second num : ");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println
		("The sum is: "+sum);
	}
}
