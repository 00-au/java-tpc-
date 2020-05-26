package tpc;

import kr.tpc.bookdto;

public class tpc10 {

	public static void main(String[] args) {
		// int, float, char, boolean ->PDT
		int a;
		a=10;
		//책(bookdto)이라는 자료형을 만들자  -> class로
		bookdto b; //새로운 자료형을 만나려면 import로 시켜줘야 에러가 안난다.
		b = new bookdto();
		b.title ="자바";
		b.price = 17000;
		b.company="영진";
		b.page=670;
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page+"\t");
	
	}

}
