package s0727;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
	
	public static void main(String[] args) {
		File f = new File("c:\\read.txt");
		try {
			FileReader fr = new FileReader(f);
			int ch = fr.read();
			String str = "";
			while(ch!=-1) {
				str += (char)ch;
			ch = fr.read();
			}
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
//reader는 char로 읽어서 아스키코드를 String str에 넣어서 String값으로 읽음거 / 그냥 char로 쓸거면 따로...