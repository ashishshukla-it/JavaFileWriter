import java.awt.image.BufferedImageFilter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Writer {
	public static void main(String args[]) throws IOException {
		long a=4129;
		String name="Ashish";
		String message=name+"'s employee id is: "+a;
		System.out.println("^^^ "+message);
		BufferedWriter fileWriter=new BufferedWriter(new FileWriter("E://learn/myMessage.txt"));		
		fileWriter.write(message);
		fileWriter.close();
	}
	
}
