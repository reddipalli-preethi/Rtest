package oopsconcepts;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
	public static void main(String args[]) {
		String str = "welcome to FileWriter";
		try {
			FileWriter fw=new FileWriter("newfile.txt");
			for(int i=0;i<str.length();i++) {
				fw.write(str.charAt(i));
			}
			System.out.println("writing completed");
			fw.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
