
public class Ex5 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		int c = 7;
		int d = 9;
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("D = " + d);

	}

}
