package learning;

public class CheckModifier {
	
	public static void main(String[] args) {
		PublicModifier pm = new PublicModifier();
		System.out.println(pm.a);
		System.out.println(pm.b);
		System.out.println(pm.returnText());
		pm.test();
	
	}

}
