package learning;

 class VariablesLearning {

	private int a = 6;
	int b = 2;
	
	static int sc=12;
	Integer ab = 3;
	static final String name="lokesh";
	
	 VariablesLearning() {
		sc=15;
		
		  final int c = 10;
		 
	}

	public int test(int a, String b) {
		sc=45;
		return 5;
	}
	
	public void assign(String a) {
		//name = a;
	}
	
	
	public static int sumOf2No(int a, int b) {
		return (a+b);
	}
	

	
	public void getSum() {
		System.out.println(sumOf2No(10,20));
		System.out.println(sumOf2No(20,20));
		System.out.println(sumOf2No(70,20));
	}
	
	
	
	

}
