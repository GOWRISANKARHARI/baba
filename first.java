import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class first
{ public static void main(String[] args)
 {
	try{
		File file = new File("input3.txt");
		Scanner sc = new Scanner(file); 
						System.out.println("Name: "); 
						String name= sc.next();
						System.out.println("Age: ");
						int age=sc.nextInt();
            System.out.println("class: ");
            String class=sc.next();
	}catch (FileNotFoundException e){
        System.out.println("Error:file not found");
        e.printStackTrace();
    }
 }
}
