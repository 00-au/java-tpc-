package tpc;

public class tpc01 {

	public static void main(String[] args) {
		//프로그래밍의 3대 요소 : 변수, 자료형(data type), 할당(=)
		// 1+1 = 2  
		int a,b,c;
		a = 1;
		b = 1;
		c = a+b; // 2
		System.out.println(c);
		
		float f; //float, double (보통 더블로 인식해서, f를 붙여주어야 함)
		f = 34.5f;
		System.out.println(f);
		
		char d;
		d = 'A'; //" " < char이 아님
		System.out.println(d);
		
		boolean g;
		g = true; //false(거짓), true(참)
		System.out.println(g);
	
		
		//book bk; book -> 자료형을 설계 -> class -> 제목,저자,출판사,가격 기억공간 여러개를 붙여 하나의 구조를 설계
		//한 덩어리가 북 타입이 된다. 
	
	}

}