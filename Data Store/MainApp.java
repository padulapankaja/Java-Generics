package paper11a;

public class MainApp {

	public static void main(String[] args) {
		GenericDataStore<Integer> gn1 = new GenericDataStore<Integer>(45, 70);
		GenericDataStore<Double> gn2 = new GenericDataStore<Double>(3.45, 7.2);
		GenericDataStore<String> gn3 = new GenericDataStore<String>("SLIIT", "Malabe");
		
		System.out.println(gn1.getVal1());
		System.out.println(gn2.getVal1());
		System.out.println(gn3.getVal1());
		
		gn1.swap();
		gn2.swap();
		gn3.swap();
		System.out.println("*******************************************");
		
		System.out.println(gn1.getVal1());
		System.out.println(gn2.getVal1());
		System.out.println(gn3.getVal1());
		
	}

}
