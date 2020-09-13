import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortInt {
	
	public SortInt(String path) {
		try {
			ArrayList<Integer> sortedList = new ArrayList<Integer>();
			File readFile = new File(path);
			Scanner reader = new Scanner(readFile);
			while (reader.hasNextLine()) {
				Integer current = reader.nextInt();
				if(sortedList.isEmpty()) {
					sortedList.add(current);
					}
				else {
					for(int i=0; i<sortedList.size(); i++) {
						if(sortedList.get(i) <= current) {
							sortedList.add(current);
							}
						else {
							sortedList.add(i+1, current);
							}
						}
					}
				}
			reader.close();
			System.out.println("Sorted List:");
			for(int i=0; i<sortedList.size(); i++) {
				System.out.println(sortedList.get(i));
				}
			}
		catch (FileNotFoundException ex){
			System.out.println("File not found.");
			}
		}

}
