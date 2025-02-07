import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class age
{ 
	public static void main(String[] args)	
	{
	try{
		File file = new File("input2.txt");
		Scanner sc = new Scanner(file); 
						System.out.println("Enter: "); 
						int n= sc.nextInt();
						System.out.println("Age: ");
						int age=sc.nextInt();
	}catch (FileNotFoundException e){
        System.out.println("Error:file not found");
        e.printStackTrace();
    }
}
}
