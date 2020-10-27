package chap18.lecture.filterstream;

import java.io.FileInputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) throws Exception {
		// 버퍼 : 중간에 저장을 임시로하는 공간(메모리의 일부분)
		String path = "01. 기본 타입과 참조 타입의 차이.png";
		FileInputStream fis = new FileInputStream(path);

		long start = System.currentTimeMillis();
		while (fis.read() != -1) {

		}
		long end = System.currentTimeMillis();
		System.out.println("총 읽은 시간 " + (end - start) + "ms");
		fis.close();
	}
}
