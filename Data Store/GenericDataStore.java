package paper11a;

public class GenericDataStore<T> {
	private T val1, val2;

	/**
	 * @param val1
	 * @param val2
	 */
	public GenericDataStore(T val1, T val2) {
		
		this.val1 = val1;
		this.val2 = val2;
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
	
	public void swap() {
		T temp = val1;
		val1 = val2;
		val2 =temp;
	}
	
	
}
