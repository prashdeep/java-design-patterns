package com.classpath.behavior.iterator;

public class NameIterator<T> implements Iterator<T> {
	
	private T name[];
	
	private int index;
	
	public NameIterator(T[] name2) {
		this.name = name2;
	}

	@Override
	public boolean hasNext() {
		if (index < name.length){
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		if(this.hasNext()){
            return name[index++];
		}
	    return null;	
	}

}
