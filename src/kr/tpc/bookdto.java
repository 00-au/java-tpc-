package kr.tpc;

public class bookdto {
	public String title;
	public int price;
	public String company;
	public int page;
	//디폴트 생성자 메서드 (생략)
	public bookdto() {
		//객체를 생성하는 작업을 한다. (기계어 코드) 기억공간 메모리(실체를 만들어지는 과정)
		//이 과정을 하며 동시에 자기 자신을 가리키는 this도 만들어진다.
	}
	public bookdto(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
