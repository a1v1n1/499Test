import java.util.Scanner;
public class SortMain {

	public static void main(String[] args) {//comment
		Scanner input = new Scanner(System.in);
		System.out.println("Int or String Sort?");
		String check = input.nextLine();
		while(!check.toLowerCase().contains("int") & !check.toLowerCase().contains("string")) {
			System.out.println("Please input only 'int' or 'string'.");
			check = input.nextLine();
			}
		if(check.toLowerCase().contains("int")) {
			System.out.println("Input file path:");
			SortInt sor = new SortInt(input.nextLine());
			}
		else {
			System.out.println("Input file path:");
			SortStr sor = new SortStr(input.nextLine());
		}
		input.close();
	}

}
