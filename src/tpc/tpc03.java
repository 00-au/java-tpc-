package tpc;

import kr.bit.PersonVO;
import kr.bit.book; //kr.bit.book이 존재하니까 가져다가 사용하라.

public class tpc03 {

	public static void main(String[] args) {
		// 기본 자료형 VS 사용자 정의 자료형
		//관계를 이해하라 
		//정수 1 개를 저장하기 위한 변수를 선언하시오.
		int a;
		a = 10; //10은 객체가 아님
		//책 1권을 저장하기 위한 변수를 선언 하시오
		book b; //변수 b = (책 = 객체) 책은 제목, 가격 , 출판사 여러개의 상태 정보로 이루어짐 
		// 기억공간 여러개를 만든다. 책이라는 것은 붙여서 하나의 형태로 만들어서 이걸 책이라고 본다.
		// 제목, 가격, 출판사. 저자 --를 설계한다. -> class
		
		//변수 : 데이터를 1개만 저장한다. 그러므로, b라는 변수에 책을 넣으려면 번지를 끌고 와야한다. (객체 생성)
		/*메모리가 아닌 보이는 실체 (instance)이니까, 인스턴스 변수, 객체 변수*/b/*번지 생성*/ = new book(); //new 만들다 생성하다. book()생성자 <<객체를 생성하는 부분 (메모리 어딘가에 객체를 생성한다 우리가 설계한대로 객체가 만들어지고 객체의 이름이 book이 되고 4개의 상태 정보를 가지고 있는 것 하나가 생성이 된다.
		//b.<경로접근
		b.title = "자바책";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		//print 그냥 줄바꿈 없는 print , println 줄바꿈해줌 ln이 줄바꿈인듯
		System.out.print(b.title+ "\t");
		System.out.print(b.price+ "\t");
		System.out.print(b.company+ "\t");
		System.out.print(b.page+ "\n");
		
		PersonVO p;
		p = new PersonVO();
		p.name = "강은화";
		p.age = 24;
		p.weight = 48.6f;
		p.height = 160.0f;
		
		System.out.print(p.name+ "\t");
		System.out.print(p.age+ "\t");
		System.out.print(p.weight+ "\t");
		System.out.print(p.height+ "\t");
		
	
	}

}
