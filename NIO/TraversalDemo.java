

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TraversalDemo {

	public static void main(String[] args) throws IOException {
		Path listDir = Paths.get("D:/Pgms");
		
		FileVisitorDemo obj = new FileVisitorDemo();
		
		Files.walkFileTree(listDir, obj);
	}

}
