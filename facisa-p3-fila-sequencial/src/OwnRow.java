
public class OwnRow {

	private static final int DOUBLE = 2;
	private Object[] myRow;
	private int count;

	public OwnRow(int tamanho) {
		this.myRow = new Object[tamanho];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void enqueue(Object obj) {
		if (count == myRow.length) {
			dublicateSize();
		}
		myRow[count++] = obj;
	}

	private void dublicateSize() {
		Object[] copyMyRow = new Object[myRow.length * DOUBLE];
		
		for (int i = 0; i < copyMyRow.length; i++) {
			copyMyRow[i] = myRow[i];
		}
		
		myRow = copyMyRow;
	}

	public void dequeue() {
		Object[] copyMyRow = new Object[myRow.length];
		
		for (int i = count-1; i > 0 ; i--) {
			copyMyRow[i-1] = myRow[i];
		}
		
		myRow = copyMyRow;
		count--;
	}

	public Object lastOnRow() {
		if (isEmpty()) {
			throw new NullPointerException();
		}
		return myRow[count-1];
	}

	public Object firstOnRow() {
		if (isEmpty()) {
			throw new NullPointerException();
		}
		return myRow[0];
	}
	
	public int size(){
		return count;
	}
}
