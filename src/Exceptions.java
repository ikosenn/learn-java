import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
	public static void main(String[] args) {
		File file = new File("src/Exception.ja");
		FileReader fr;
		try {
			fr = new FileReader(file);
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
