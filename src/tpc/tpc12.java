package tpc;

import kr.tpc.BookVO;

public class tpc12 {

	public static void main(String[] args) {
		//생성자 -> 생성 + 초기화 -> 메소드를 중복정의한다.
	BookVO b1 = new BookVO();
	System.out.print(b1.title+"\t");
	System.out.print(b1.price+"\t");
	System.out.print(b1.company+"\t");
	System.out.println(b1.page);
	//생성자메소드에서 초기화 작업을 했기 때문에 값이 나온다. 메인에서
	//하지 않아도.
	BookVO b2 = new BookVO();
	System.out.print(b2.title+"\t");
	System.out.print(b2.price+"\t");
	System.out.print(b2.company+"\t");
	System.out.println(b2.page);
	
	
	BookVO b3 = new BookVO("Python", 18000, "대림", 920);	
	System.out.print(b3.title+"\t");
	System.out.print(b3.price+"\t");
	System.out.print(b3.company+"\t");
	System.out.println(b3.page);
	
	}
	

}
