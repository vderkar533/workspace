package JavaBasics;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b=a.clone();
		
		System.arraycopy(a, 0, b, 0, a.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		a[2]=9;
		System.out.println(b[2]);
	}

}
