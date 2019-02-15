import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void main(String[] args) {
	
		Path p1=Paths.get("e:\\sample\\demos\\niodemo.txt");
	    try {
			
			//Files.createDirectory(p1);
	    	Files.createFile(p1);
	    	System.out.println("File created");
		} catch (IOException e) {
		System.out.println("file can not be created");
		System.out.println(e);
	
		}
		
	}

}
