package tpc;

import kr.tpc.bookdto;

public class tpc14 {

	public static void main(String[] args) {
		// 책 -> class (BookDTO) -> 객체 -> 인스턴스 
		String title = "스프링";
		int price = 25000;
		String company="제이펍";
		int page = 890;
		
		bookdto dto; //dto는 아직 무언가를 가리키고 있지 않기 때문에 지금은 그냥 object라고 불린다. 그냥 객체변수 
		dto= new bookdto(title, price, company, page); //이 때 dto는 객체가 아니고, instance이다. 무언가를 가리키고 있고 구체적이기 때문에.
		/*앞 서 작성했던, title price company page가 일단 여기로 들어왔다
		 * 그냥 각각의 변수들이다. */
		
		 bookprint(dto);
	
	}
	
	public static void bookprint(bookdto dto) {
		System.out.print(dto.title+"\t");
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.print(dto.page+"\t");
		
	}

}
