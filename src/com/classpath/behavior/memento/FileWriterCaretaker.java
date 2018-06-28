package com.classpath.behavior.memento;

public class FileWriterCaretaker {

	private Object obj;
	
	public void save(FileWriterOriginator fileWriter){
		this.obj=fileWriter.save();
	}
	
	public void undo(FileWriterOriginator fileWriter){
		fileWriter.undoToLastSave(obj);
	}
}
