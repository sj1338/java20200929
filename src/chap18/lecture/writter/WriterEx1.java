package chap18.lecture.writter;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "writer.txt";
		Writer writer = new FileWriter(path);
		
		writer.write('한');
		
		char[] arr = new char[5];
		arr[0] = '자';
		arr[1] = '바';
		arr[2] = '신';
		arr[3] = '용';
		arr[4] = '권';
		
		writer.write(arr);
		writer.write(arr, 2, 3); // 2번 index부터 3개 (신용권)
		writer.write("\n이것이자바다"); // \n 은 엔터
		
		writer.close();
	}
}
