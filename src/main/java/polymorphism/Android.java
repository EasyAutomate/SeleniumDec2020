package polymorphism;

public class Android extends Mobile {
	public static void main(String[] args) {
		Android m = new Android();
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
