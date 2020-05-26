package tpc;

public class tpc07 {

	public static void main(String[] args) {
		int a = 20;
		float b = 56.7f;
		// a+b=?
		float v=sum(a,b); // call by value (값)
		System.out.println(v);
		
		int[] arr = {1,2,3,4,5};
		//배열의 총 합 = ?
		int vv=arrSum(arr); //call by reference (번지)
		System.out.println(vv); // 15
	}
	
	public static int arrSum(int[] x) {
		//합을 구헤보자
		int hap = 0;
		for(int i=0; i<x.length; i++) {
			hap+=x[i];
		}
		return 0;
	}
	public static float sum(int a, float b) {
		float v = a+b;
		return v;
	}

}
