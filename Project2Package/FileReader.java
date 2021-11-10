package Project2Package;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
//Question 20
public class FileReader {
	public static void readFile() {
		
		File file = new File("/Users/joydi/OneDrive/Desktop/superheroes.txt");
		try {
			Scanner scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
			}
		
		
	}
}
