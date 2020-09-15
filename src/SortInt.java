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
			System.out.println("Sorting...");
			while (reader.hasNextLine()) {
				Integer current = reader.nextInt();
				if(sortedList.isEmpty()) {
					sortedList.add(current);
					}
				else {
					int cap = sortedList.size();
					int x = 0;
					boolean sorted = false;
					while(!sorted & x < cap) {
						if(sortedList.get(x) >= current) {
							int temp = sortedList.get(x);
							sortedList.set(x, current);
							sortedList.add(x+1, temp);
							sorted = true;
							}
						x++;
						}
					if(!sorted) {
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
