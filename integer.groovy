class Integer2 {

	int value;
	
	int getValue() {
		return value;
	}
	
	void setValue(int i) {
		this.value = i;
	}
	
	boolean isEven() {
		if (value%2 == 0) {
			return true;
		} else {
			return flase;
		}
	}
	
	boolean isOdd() {
		if (value%2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	void prettyPrint() {
		println value;
	}
	
	String toString() {
		String str = value + "";
		return str;
	}
}