package com.classpath.behavior.iterator;


public class NameCollection implements Collection {

	 public String name[]={"Pradeep", "Praveen","Krishna","Kiran","Vinay"}; 
	
	 public int age[]={26, 25,24,25,23}; 
		
	@Override
	public Iterator iterator() {
		
		return new NameIterator() ;
	}
	
	
	private class NameIterator implements Iterator{
		
		int i;

		@Override
		public boolean hasNext() {
			if (i<name.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
	            return name[i++];
			}
		    return null;	
		}
	
	}
}


