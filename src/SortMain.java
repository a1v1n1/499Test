import java.util.Scanner;
public class SortMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Int or String Sort?");
		String check = input.nextLine();
		while(!check.toLowerCase().equals("int") || !check.toLowerCase().equals("string")) {
			System.out.println("Please input only 'int' or 'string'.");
			check = input.nextLine();
			}
		if(check.toLowerCase().equals("int")) {
			System.out.println("Input file path:");
			SortInt sor = new SortInt(input.nextLine());
			}
	}

}
