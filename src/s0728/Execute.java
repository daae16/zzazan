package s0728;

import java.util.List;
import java.util.Map;

public class Execute {
	
	public static void main(String[] args) {
		String str = ReadText.readText("c:\\read.txt");
		List<Map<String,String>> phList = ReadText.parse(str);
		System.out.println(phList);
	}

}
