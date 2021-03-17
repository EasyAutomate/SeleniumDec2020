package polymorphism;

public class Blackberry extends Mobile {

	@Override
	public void keyboard() {
		System.out.println("Qwerty Keyboard");
	}

	@Override
	public void screen() {
		System.out.println("Touch (LCD) screen");
	}

	@Override
	public void typeOfPhone() {
		System.out.println("Smartphone");
	}
	
	public static void main(String[] args) {
		Blackberry m = new Blackberry();
		m.noOfSim = 2;
		m.noOfMemoryCard=1;
		m.internalMemoryinGB=64;
		m.externalMemorySupportedinGB=512;
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
