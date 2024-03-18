package restalma;

import java.net.URL;
import java.net.URLConnection;

public class Test {
	public static void main(String[] args) throws Exception{
		URL url=new URL("http://localhost:2020/restalma/rest/helloservice/hello");
		
		URLConnection urlcon=url.openConnection();
		
		urlcon.getInputStream();
	}
}
