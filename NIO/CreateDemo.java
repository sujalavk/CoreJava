import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CreateDemo {

	public static void main(String[] args) {
		Path p=Paths.get("E:\\sample\\sampletwo.txt");
		try {
			//Files.createFile(p);
			System.out.println(Files.isDirectory(p));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
