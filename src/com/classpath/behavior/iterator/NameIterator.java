package com.classpath.behavior.iterator;

public class NameIterator implements Iterator {
	
	private String name[];
	private int index;
	
	public NameIterator(String[] name) {
		this.name = name;
	}

	@Override
	public boolean hasNext() {
		if (index < name.length){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if(this.hasNext()){
            return name[index++];
		}
	    return null;	
	}

}
