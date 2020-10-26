package chap15.textbook.s150403;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
//		Map<String, String> map;
		Properties properties = new Properties();
		String path = PropertiesExample.class
				.getResource("database.properties")
				.getPath();
		path = URLDecoder.decode(path, "utf-8");
		
		// 파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장
		properties.load(new FileReader(path)); // 파일의 내용을 읽어들일수있는 객체 생성
		
		System.out.println(properties.size());
//		Object urlValue = properties.get("url");
		String urlValue = properties.getProperty("url"); // 스트링
		String driver = properties.getProperty("driver");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(urlValue);
		System.out.println(driver);
		System.out.println(username);
		System.out.println(password);
		
	}
}
