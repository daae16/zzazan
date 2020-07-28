package s0728;

import java.io.File;

public class FolderTest {

	public static void main(String[] args) {
		File path = new File("c:\\java_study\\address");
		if(path.isDirectory()) {
			File[] files = path.listFiles();
			for(File file:files) {
				if(!file.isDirectory() && file.getName().indexOf("build_")==0) {
					System.out.println(file.getName());
					
				}
				
			}
		}
	}
}


//폴더에서 파일 보는 법
//빌드인거 찾아와서 txt들~ ㄷ ㅏ~~ 싹다 알아서~ 잘 ~~ 알아서~ ㄷ ㅏ ~ 숙제해라~ 알잘딱깔센 ^3^
//저파일만 계속 읽어서 리스트 만들어서 인서트.....................ㅎㅎ...