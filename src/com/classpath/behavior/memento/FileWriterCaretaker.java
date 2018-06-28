package com.classpath.behavior.memento;

public class FileWriterCaretaker {

	private FileWriterOriginator.Memento obj;
	
	public FileWriterOriginator.Memento save(FileWriterOriginator fileWriter){
		this.obj=fileWriter.save();
		return this.obj;
	}
	
	public Object undo(FileWriterOriginator fileWriter){
		return fileWriter.undoToLastSave(obj);
	}
}
