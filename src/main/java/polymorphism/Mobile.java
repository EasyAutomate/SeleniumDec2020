package polymorphism;

public class Mobile {

	public int noOfSim = 1;
	public int noOfMemoryCard = 1;
	public int internalMemoryinGB = 32;
	public int externalMemorySupportedinGB = 64;

	public void keyboard() {
		System.out.println("Standard Keyboard");
	}

	public void screen() {
		System.out.println("Non Touch (LCD) screen");
	}

	public void typeOfPhone() {
		System.out.println("Basic");
	}

	public int sum(int a, int b) {
		System.out.println("Sum of 2 nos");
		return a + b;
	}

	public int sum(int a, int b, int c) {
		System.out.println("Sum of 3 nos");
		return a + b + c;
	}

	public int sum(int a, int b, int c, int d) {
		System.out.println("Sum of 3 nos");
		return a + b + c + d;
	}

	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m.noOfSim);
		System.out.println(m.noOfMemoryCard);
		System.out.println(m.internalMemoryinGB);
		System.out.println(m.externalMemorySupportedinGB);
		m.keyboard();
		m.screen();
		m.typeOfPhone();
		System.out.println(m.sum(23, 45));
		System.out.println(m.sum(34, 56, 45));
		System.out.println(m.sum(12, 45, 34, 892));
	}

}
