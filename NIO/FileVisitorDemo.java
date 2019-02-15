




	import java.io.IOException;
	import java.nio.file.FileVisitResult;
	import java.nio.file.FileVisitor;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.nio.file.attribute.BasicFileAttributes;

	class FileVisitorDemo  implements FileVisitor<Path> {

	    public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
	        System.out.println("post Visit " + dir);
	        return FileVisitResult.CONTINUE;//traversal must continue
	    }

	    
	    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

	        System.out.println("pre to visit " + dir);
	                return FileVisitResult.CONTINUE;

	    }

	        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

	        System.out.println("Currently visiting "+file);
	        System.out.println("Is this  a directory: "+ Files.isDirectory(file));
	        System.out.println("Checking done..!!");
	        return FileVisitResult.CONTINUE;

	    }

	        public FileVisitResult visitFileFailed(Path file, IOException e) throws IOException {
	        System.err.println(e.getMessage());
	        return FileVisitResult.CONTINUE;
	    }
	}


