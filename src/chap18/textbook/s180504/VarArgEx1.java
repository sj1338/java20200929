package chap18.textbook.s180504;

public class VarArgEx1 {
	public static void main(String[] args) {
	

	public static void method(int...is nums) {
		System.out.println("method 실행");
		System.out.println(nums.length);
		
		
		
		for (int  i=0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
			
			
		
	}
}
