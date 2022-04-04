package fb.login;

public class Sample {

	int a;
	int b;
                      //a=1  , b=1
	private void add(int a, int b) {
		a = 10;
		b = 20;

		this.a = a;
		this.b = b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Sample s = new Sample();

		System.out.println(s.a);
		System.out.println(s.b);
		s.add(1, 1);

		System.out.println(s.a);
		System.out.println(s.b);
	}
}
