package learning;

public class PublicModifier {

	public int a = 5;
	public String b= "Lokesh";
	
	public String returnText() {
		return "Kumar";
	}
	
	public void test() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(returnText());
	}
	
}
