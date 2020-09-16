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
					int x = 0;
					while(!added & x<cap) {
						if(sortedList.get(x).charAt(0) > current.charAt(0)) {
							String temp = sortedList.get(x);
							sortedList.set(x, current);
							sortedList.add(x+1, temp);
							added = true;
							}
						if(sortedList.get(x).charAt(0) == current.charAt(0)) {
							int small = sortedList.get(x).length();
							if(small > current.length()) {
								small = current.length();
								}
							for(int i = 1; i < small; i++) {
								if(sortedList.get(x).charAt(i) > current.charAt(i)) {
									String temp = sortedList.get(x);
									sortedList.set(x, current);
									sortedList.add(x+1, temp);
									added = true;
									break;
									}
								}
							if(!added & sortedList.get(x).length()<current.length()) {
								sortedList.add(x+1, current);
								added = true;
								}
							if(!added & sortedList.get(x).length()>current.length()) {
								String temp = sortedList.get(x);
								sortedList.set(x, current);
								sortedList.add(x+1, temp);
								added = true;
								}
							}
						x++;
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
