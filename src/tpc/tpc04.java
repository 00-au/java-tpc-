package tpc;

public class tpc04 {

	public static void main(String[] args) {
		//4.데이터를 이동하라 (변수 vs 배열)
		int a,b,c;
		a = 10;
		b = 20;
		c = 30;
		// a+b+c = ? 메서드 처리하라 -> hap()
		hap(a,b,c);
		
		//하나로 묶어서 이동할 수는 없을까? > 배열
		
		int [] arr;
		arr = new int[3];
		arr [0] = a;
		arr [1] = b;
		arr [2] = c;
		//호출
		hap1(arr);
		
	}
	public static void hap(int x,int y,int z) {
		int sum =x+y+z;
		System.out.println(sum);
	}
	public static void hap1(int[] x) {
		//반복문을 활용한다. - for, while문
//		int sum = x[0] + x[1] + x[2];
		int i;
		int sum=0;
		for (i=0; i<x.length; i++) {
			sum +=x[i];
		}
		System.out.println(sum);
	}
	
}
