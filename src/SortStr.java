import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortStr {

	public SortStr(String path) {
		try {
			ArrayList<String> sortedList = new ArrayList<String>();
			File readFile = new File(path);
			Scanner reader = new Scanner(readFile);
			System.out.println("Sorting...");
			while (reader.hasNextLine()) {
				String current = reader.nextLine();
				if(sortedList.isEmpty()) {
					sortedList.add(current);
					}
				else {
					boolean added = false;
					int cap = sortedList.size();
					for(int i=0; i<cap; i++) {
						int shortest = sortedList.get(i).length();
						if(shortest > current.length()) {
							shortest = current.length();
						}
						boolean equal = true;
						int z = -1;
						while (equal & !(z>shortest)) {
							z++;
							if(current.charAt(z) < sortedList.get(i).charAt(z)) {
								equal = false;
								added = true;
								sortedList.add(i-1, current);
								}
							if(current.charAt(z) > sortedList.get(i).charAt(z)) {
								equal = false;
								}
							}
						if(equal) {
							added = true;
							sortedList.add(i+1, current);
							}
						}
					if(!added) {
						sortedList.add(current);
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
