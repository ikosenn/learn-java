import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOps {

	public static void main(String[] args) throws FileNotFoundException {
		String filename = "src/FileOps.java";
		
		File textFile = new File(filename);
	
		Scanner in = new Scanner(textFile);
		int count = 1; 
		while (in.hasNextLine() ) {
			String line = in.nextLine();
			System.out.println(count + ": " + line);
			count += 1;
		}
		
		in.close();
	}

}
