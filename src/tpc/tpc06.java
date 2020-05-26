package tpc;

public class tpc06 {

	public static void main(String[] args) {
		// 5. 메서드 -> 동작(어떻게?), 기능 메인도 메소드다.
		// 정수 2개를 매개변수르 받아서 총 합을 구하여 리턴하는 메소드를 정의 하시오.
		int a = 67;
		int b = 98;
		//a+b ? *메소드 활용
		//메소드 호출, 결과 값 리턴으로 결과 받음
		int result=sum(a,b);
		//결과값출력
		System.out.println(result);
		int[] arr=makeArr();
		int hap = 0;
		for(int i=0; i<arr.length; i++) {
			hap+=arr[i];
		}
		System.out.println(hap);
	}
	//메소드 정의
	public static int sum(int a, int b /*배열의 형태도 가능 */) {
		int v = a+b;
		//결과 값 리턴
		return v; //정수형태 //void는 리턴하지 않겠다는 뜻인데, sum의 값에 담아야하는데 sum은 void로 되어있으므로 바꿔야 함
	}
	
	//10,20,30 3개를 리턴하고싶어요. 
	public static int[] makeArr() {
		int x = 10;
		int y = 20;
		int z = 30;
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		return arr; /*리턴은 한개의 형태로만 리턴가능 ex>자판기*/
	}
}
