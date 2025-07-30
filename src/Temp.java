import java.util.Scanner;

public class Temp {
    public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Temp in  celsius : ");
		int temp= input.nextInt();
		int fahrenheit = ((temp* 9/5)+32);
		System.out.print("Temp in fahrenheit : " +fahrenheit);
	}
}
