package paper11b;

public class SampleGenaricStore<T> {
	private T val1, val2;
	public SampleGenaricStore(T n1, T n2) {
		
		this.val1 = n1;
		this.val2 = n2;
	}
	public T getVal1() {
		return val1;
	}
	public void setVal1(T val1) {
		this.val1 = val1;
	}
	public T getVal2() {
		return val2;
	}
	public void setVal2(T val2) {
		this.val2 = val2;
	}
		
	public void interchange() {
		
		T temp = val1;
		val1 = val2;
		val2 = temp;
	}
	
}
