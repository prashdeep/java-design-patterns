package com.classpath.behavior.memento;

public class FileWriterOriginator {

	private String fileName;
	private StringBuilder content;
	
	public FileWriterOriginator(String file){
		this.fileName=file;
		this.content=new StringBuilder();
	}
	
	@Override
	public String toString(){
		return this.content.toString();
	}
	
	public void write(String str){
		content.append(str);
	}
	
	public Memento save(){
		return new Memento(this.fileName,this.content);
	}
	
	public Memento undoToLastSave(Object obj){
		Memento memento = (Memento) obj;
		this.fileName= memento.fileName;
		this.content=memento.content;
		return memento;
	}
	
	
	public class Memento{
		private String fileName;
		private StringBuilder content;
		
		public Memento(String file, StringBuilder content){
			this.fileName=file;
			this.content=new StringBuilder(content);
		}

		@Override
		public String toString() {
			return "Memento [fileName=" + fileName + ", content=" + content + "]";
		}
		
		
	}
}
