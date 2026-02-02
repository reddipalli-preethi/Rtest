package oopsconcepts;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
	public static void main(String args[])throws IOException {
		int ch;
		FileReader fr = new FileReader("text.txt");
		while((ch=fr.read())!=-1)
			System.out.println((char) ch);
		fr.close();
		}

}
