package kr.tpc;

public class Inflearn {
	private Inflearn() {
		//private 생성자로 만들기.
	}
	//인스턴스 메서드
	public static void tpc() {
		System.out.println("TPC 강의 재밌다.");
	}
	
	//클래스 메서드
	public static void java() {
		System.out.println("Java 강의 재밌다.");
	
		//JAVA API 생성자 private
		//System sys = new System(); //사용 불가
		//System.out.println();
		
		//Math m = new Math(); //사용불가
		//int v = Math.min(9, 3);
		//System.out.println(v);
		
	}
	
}
