package chap18.textbook.exercises.p07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chap18/textbook/exercises/p07/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int lineNum = 0;
		while ((line = br.readLine()) != null) { // 메뉴얼에도 쓰여있지만, 애초에 string 타입이라 -1 못씀
			lineNum++;
			System.out.println(lineNum + ":" + line);
		}
		
		br.close();
		fr.close();
	}
}