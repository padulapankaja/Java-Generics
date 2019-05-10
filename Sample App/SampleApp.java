package paper11b;

public class SampleApp {
	public static void main(String[] args) {

	SampleGenaricStore<Integer> gn1 = new SampleGenaricStore<Integer>(34, 56);
	SampleGenaricStore<Double> gn2 = new SampleGenaricStore<Double>(2.12, 8.34);
	SampleGenaricStore<String> gn3 = new SampleGenaricStore<String>("Metro", "SLIIT");
	
	System.out.println(gn1.getVal2());
	System.out.println(gn2.getVal2());
	System.out.println(gn3.getVal2());
	
	gn1.interchange();
	gn2.interchange();
	gn3.interchange();
	System.out.println("*************************");
	System.out.println(gn1.getVal2());
	System.out.println(gn2.getVal2());
	System.out.println(gn3.getVal2());
	
	}

}
