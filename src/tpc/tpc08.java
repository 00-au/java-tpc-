package tpc;

public class tpc08 {

	public static void main(String[] args) {
		int a= 30;
		int b=50;
		int v=add(a,b); //static method 호출 call 45도 정도로 기울어져있음 알아볼 수 있게
		
		System.out.println(v);
		
	}
	public static/*고정된위치에올라오는것*/ int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

}
