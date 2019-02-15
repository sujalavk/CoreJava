


	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import static java.nio.file.StandardCopyOption.*;

	public class FIleCopyDemo {

		
		
		    public static void main(String[] args)
		{
		        Path source = Paths.get("e:\\sample\\demos\\simple.txt"); 
		    
		        Path target=Paths.get("e:\\sample\\dbmsfaq.txt");
		        try
		        {
		          //Files.copy(source, target, COPY_ATTRIBUTES);
		          // Files.move(source, target, REPLACE_EXISTING);
		         // Files.delete(source);
		          Files.deleteIfExists(source);
		        
		        }
		        catch(IOException e)
		        {
		        System.out.println(e);
		        }
		}
		



	}
