package learn;

import learning.PublicModifier;

public class CheckModifier3 extends PublicModifier{
	
	public void a() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(returnText());
	}
	public static void main(String[] args) {
		CheckModifier3 cm = new CheckModifier3();
		cm.a();
	}

}
