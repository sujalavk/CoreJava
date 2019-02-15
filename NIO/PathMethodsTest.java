import java.nio.file.Path;
import java.nio.file.Paths;


public class PathMethodsTest {

	public static void main(String[] args) {
	Path p=Paths.get("e:\\sample\\demos");
	Path q=Paths.get("e:\\sample\\demos\\niodemo.txt");
	System.out.println("FileName:"+p.getFileName());
	System.out.println("Namecount:"+p.getNameCount());
	System.out.println("isabsolute:"+p.isAbsolute());
	System.out.println("Parent:"+p.getParent());
	System.out.println("root:"+p.getRoot());
	int x=p.compareTo(q);
	System.out.println("x:"+x);
	if(x==0)
		System.out.println("equal path");
	else
		System.out.println(" not equal path");
	}


}
