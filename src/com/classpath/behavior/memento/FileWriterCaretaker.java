package com.classpath.behavior.memento;

public class FileWriterCaretaker {

	private Object obj;
	
	public Object save(FileWriterOriginator fileWriter){
		this.obj=fileWriter.save();
		return this.obj;
	}
	
	public void undo(FileWriterOriginator fileWriter){
		fileWriter.undoToLastSave(obj);
	}
}
