package storage;

import java.util.Vector;

public class VectorStorage<T> implements Storage<T> {

	private Vector<T> data;
	
	public VectorStorage() {
		data = new Vector<T>();
	}
	
	@Override
	public boolean add(T o) {
		return data.add(o);
	}

	@Override
	public T remove(int index) throws ArrayIndexOutOfBoundsException {
		return data.remove(index);
	}

	@Override
	public int count() {
		return data.size();
	}

}
