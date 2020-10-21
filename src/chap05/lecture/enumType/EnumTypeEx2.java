package chap05.lecture.enumType;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VAULE4;
		System.out.println(e1.name());
		System.out.println(e1.ordinal()); //순서를 리턴해주는 메소드
		
		MyEnum e2 = MyEnum.valueOf("VALUE3");
		System.out.println(e2.name());
		
		int diff = e1.compareTo(e2);
		System.out.println(diff);
		
		System.out.println(e2.compareTo(e1));
		
		MyEnum[] arr = MyEnum.values();
		
		System.out.println(arr.length);
	}
}
